public class com.google.common.base.VerifyException extends java.lang.RuntimeException {
  public com.google.common.base.VerifyException();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/RuntimeException."<init>":()V
       4: return

  public com.google.common.base.VerifyException(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #12                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
       5: return

  public com.google.common.base.VerifyException(java.lang.String, java.lang.Throwable);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #15                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
       6: return

  public com.google.common.base.VerifyException(java.lang.Throwable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #18                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
       5: return
}
