package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sun.reflect.generics.reflectiveObjects.LazyReflectiveObjectGenerator;

@Component
@Aspect
@Order(1)

public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUnilibrary(){
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUnilibrary(){
//    }
//
//
//    @Pointcut("allGetMethodsFromUnilibrary() || allReturnMethodsFromUnilibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//
//
//    @Before("allGetMethodsFromUnilibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUnilibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnMethodsFromUniLibrary(){
//        System.out.println("beforeGetAndReturnMethodsFromUniLibrary: writing Log #3");
//    }





    @Before("aop.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj:arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Info about book: name - " + myBook.getName() + ", author - " + myBook.getAuthor() + ", year of publication - " + myBook.getYearOfPublication());
                }
            }
        }



        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("---------------------------------------------");
    }



    
}
