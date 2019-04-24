public class com.b.a.d implements com.b.a.g {
  public com.b.a.d(android.os.Handler);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Landroid/os/Handler;
       9: return

  public void a(int, java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/os/Handler;
       4: aload_0
       5: getfield      #17                 // Field a:Landroid/os/Handler;
       8: iload_1
       9: aload_3
      10: invokevirtual #25                 // Method android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
      13: invokevirtual #29                 // Method android/os/Handler.sendMessage:(Landroid/os/Message;)Z
      16: pop
      17: return
}
