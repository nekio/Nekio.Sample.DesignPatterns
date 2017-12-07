package nekio.sample.dp.behavioural.command.generic;

/**
 *
 * @author Nekio
 */

import java.lang.reflect.Method;

// Class for process any class, even if it doesn't implement ICommand interface
public class ReflectCommand {
    private Object reflectionObject;
    private Method method;
    private Object[] parameters;

    public ReflectCommand(Object reflectionObject, String action, Object[] parameters) {
        this.reflectionObject = reflectionObject;
        this.parameters = parameters;
        
        Class clazz = reflectionObject.getClass();
        Class[] parametersTypes = null;
        if(parameters != null){
            parametersTypes = new Class[this.parameters.length];
            for (int i = 0; i < this.parameters.length; i++) {
                parametersTypes[i] = this.parameters[i].getClass();
            }
        }
        
        try {
            this.method = clazz.getMethod(action, parametersTypes);
        } catch(NoSuchMethodException e) {
            System.err.println(e);
        }
    }

    public Object execute() {
        Object result = null;
        
        try {
            result = method.invoke(reflectionObject, parameters);
        }
        catch(Exception e) {
            System.err.println(e);
        }
        
        StringBuilder paramsList = new StringBuilder();
        if(parameters != null){
            for(int i=0 ; i < parameters.length; i++){
                if(i != 0){
                    paramsList.append(",");
                }
                
                paramsList.append(parameters[i].toString());
            }
        }
        
        System.out.println(
            "ReflectCommand.execute(): " + 
            reflectionObject + "." +
            method.getName() +
            "(" + paramsList.toString() + ")\n"
        );
        
        return result;
    }
}
