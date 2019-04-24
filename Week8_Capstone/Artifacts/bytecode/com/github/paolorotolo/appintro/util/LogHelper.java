public class com.github.paolorotolo.appintro.util.LogHelper {
  static {};
    Code:
       0: ldc           #8                  // String Log:
       2: invokevirtual #20                 // Method java/lang/String.length:()I
       5: putstatic     #22                 // Field LOG_PREFIX_LENGTH:I
       8: return

  public com.github.paolorotolo.appintro.util.LogHelper();
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: return

  public static void d(java.lang.String, java.lang.Object...);
    Code:
       0: return

  public static void e(java.lang.String, java.lang.Throwable, java.lang.Object...);
    Code:
       0: aload_0
       1: bipush        6
       3: aload_1
       4: aload_2
       5: invokestatic  #34                 // Method log:(Ljava/lang/String;ILjava/lang/Throwable;[Ljava/lang/Object;)V
       8: return

  public static void e(java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: bipush        6
       3: aconst_null
       4: aload_1
       5: invokestatic  #34                 // Method log:(Ljava/lang/String;ILjava/lang/Throwable;[Ljava/lang/Object;)V
       8: return

  public static void i(java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: iconst_4
       2: aconst_null
       3: aload_1
       4: invokestatic  #34                 // Method log:(Ljava/lang/String;ILjava/lang/Throwable;[Ljava/lang/Object;)V
       7: return

  public static java.lang.String makeLogTag(java.lang.Class);
    Code:
       0: aload_0
       1: invokevirtual #69                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
       4: invokestatic  #72                 // Method makeLogTag:(Ljava/lang/String;)Ljava/lang/String;
       7: areturn

  public static void v(java.lang.String, java.lang.Object...);
    Code:
       0: return

  public static void w(java.lang.String, java.lang.Throwable, java.lang.Object...);
    Code:
       0: aload_0
       1: iconst_5
       2: aload_1
       3: aload_2
       4: invokestatic  #34                 // Method log:(Ljava/lang/String;ILjava/lang/Throwable;[Ljava/lang/Object;)V
       7: return

  public static void w(java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: iconst_5
       2: aconst_null
       3: aload_1
       4: invokestatic  #34                 // Method log:(Ljava/lang/String;ILjava/lang/Throwable;[Ljava/lang/Object;)V
       7: return
}
