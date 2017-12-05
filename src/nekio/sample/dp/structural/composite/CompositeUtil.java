package nekio.sample.dp.structural.composite;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.structural.composite.generic.IEntity;


public class CompositeUtil {
    private final static String WHITESPACES = "  ";
    
    public static String formatComposition(IEntity entity){
        return "{" + formatComposition(entity, 1) + "\n}";
    }
    
    private static <T>String formatComposition(IEntity<T> entity, int level){
        StringBuilder text = new StringBuilder();

        if(entity instanceof CompositeEntity){
            text.append("\n" + repeat(level) + "\"" + entity.getDescription() + "\":{");
            text.append("\n" + repeat(level + 1) + "\"id\":\"" + entity.getId() + "\",");
            text.append("\n" + repeat(level + 1) + "\"composite\":{");
        
            CompositeEntity<T> composite = (CompositeEntity<T>)entity;
            for(IEntity innerEntity : composite.getEntities()){
                text.append(formatComposition(innerEntity, level + 2));
            }
            text.append("\n" + repeat(level + 1) + "}");
            text.append("\n" + repeat(level) + "}");
        }else if(entity instanceof SingleEntity){
            text.append("\n" + repeat(level + 1) + "\"single\":\"[" + entity.getId() + "=" + entity.getDescription() + "]\",");
        }
        
        return text.toString();
    }
    
    private static String repeat(int level){
        return String.format("%0" + level + "d", 0).replace("0", CompositeUtil.WHITESPACES);
    }
}
