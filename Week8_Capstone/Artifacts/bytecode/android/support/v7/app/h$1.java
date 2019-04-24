final class android.support.v7.app.h$1 implements java.lang.Thread$UncaughtExceptionHandler {
  final java.lang.Thread$UncaughtExceptionHandler a;

  android.support.v7.app.h$1(java.lang.Thread$UncaughtExceptionHandler);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Ljava/lang/Thread$UncaughtExceptionHandler;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void uncaughtException(java.lang.Thread, java.lang.Throwable);
    Code:
       0: aload_0
       1: aload_2
       2: invokespecial #41                 // Method a:(Ljava/lang/Throwable;)Z
       5: ifeq          73
       8: new           #43                 // class java/lang/StringBuilder
      11: dup
      12: invokespecial #44                 // Method java/lang/StringBuilder."<init>":()V
      15: astore_3
      16: aload_3
      17: aload_2
      18: invokevirtual #27                 // Method java/lang/Throwable.getMessage:()Ljava/lang/String;
      21: invokevirtual #48                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload_3
      26: ldc           #50                 // String . If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.
      28: invokevirtual #48                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      31: pop
      32: new           #21                 // class android/content/res/Resources$NotFoundException
      35: dup
      36: aload_3
      37: invokevirtual #53                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      40: invokespecial #56                 // Method android/content/res/Resources$NotFoundException."<init>":(Ljava/lang/String;)V
      43: astore_3
      44: aload_3
      45: aload_2
      46: invokevirtual #60                 // Method java/lang/Throwable.getCause:()Ljava/lang/Throwable;
      49: invokevirtual #64                 // Method java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
      52: pop
      53: aload_3
      54: aload_2
      55: invokevirtual #68                 // Method java/lang/Throwable.getStackTrace:()[Ljava/lang/StackTraceElement;
      58: invokevirtual #72                 // Method java/lang/Throwable.setStackTrace:([Ljava/lang/StackTraceElement;)V
      61: aload_0
      62: getfield      #14                 // Field a:Ljava/lang/Thread$UncaughtExceptionHandler;
      65: aload_1
      66: aload_3
      67: invokeinterface #74,  3           // InterfaceMethod java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
      72: return
      73: aload_0
      74: getfield      #14                 // Field a:Ljava/lang/Thread$UncaughtExceptionHandler;
      77: aload_1
      78: aload_2
      79: invokeinterface #74,  3           // InterfaceMethod java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
      84: return
}
