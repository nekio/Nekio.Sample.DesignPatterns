package nekio.sample.dp.creational.factory.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

import java.lang.reflect.Constructor;

public abstract class Factory<T> implements IFactory<T>{
    protected T t;
    protected boolean genericConstructorParams;
    
    public void setGenericConstructorParams(boolean genericConstructorParams){
        this.genericConstructorParams = genericConstructorParams;
    }
    
    @Override
    public T create(){
        return (T)t;
    }
    
    @Override
    public T create(Class clazz) {
        T t = null;
        try {
            t = (T)clazz.newInstance();
        } catch (Exception e){
            System.out.println(e);
        }
        
        return t;
    }
    
    @Override
    public T create(Class clazz, Object ... params) {
        T t = null;
        try {
            int paramsCount = params.length;
            Class[] paramsTypes = new Class[paramsCount];
            for(int i=0; i < paramsCount; i++){
                Class currentClass = params[i].getClass();
                
                if(genericConstructorParams){
                    if(isNativeWrapper(currentClass)){
                        paramsTypes[i] = currentClass;
                    }else{
                        paramsTypes[i] = Object.class;
                    }
                }else{
                    paramsTypes[i] = currentClass;
                }
            }
            
            Constructor classConstructor = clazz.getConstructor(paramsTypes);     
            t = (T)classConstructor.newInstance(params);
        } catch (Exception e){
            System.out.println(e);
        }
        
        return t;
    }
    
    private boolean isNativeWrapper(Class clazz){
        boolean result = false;
        
        if(clazz.equals(String.class)){
            result = true;
        }else if(clazz.equals(Character.class)){
            result = true;
        }else if(clazz.equals(Boolean.class)){
            result = true;
        }else if(clazz.equals(Short.class)){
            result = true;
        }else if(clazz.equals(Integer.class)){
            result = true;
        }else if(clazz.equals(Long.class)){
            result = true;
        }else if(clazz.equals(Float.class)){
            result = true;
        }else if(clazz.equals(Double.class)){
            result = true;
        }
        
        return result;
    }
}
