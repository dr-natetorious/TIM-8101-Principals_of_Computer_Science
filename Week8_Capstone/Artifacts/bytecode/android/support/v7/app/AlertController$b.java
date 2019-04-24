final class android.support.v7.app.AlertController$b extends android.os.Handler {
  public android.support.v7.app.AlertController$b(android.content.DialogInterface);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method android/os/Handler."<init>":()V
       4: aload_0
       5: new           #17                 // class java/lang/ref/WeakReference
       8: dup
       9: aload_1
      10: invokespecial #20                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      13: putfield      #22                 // Field a:Ljava/lang/ref/WeakReference;
      16: return

  public void handleMessage(android.os.Message);
    Code:
       0: aload_1
       1: getfield      #31                 // Field android/os/Message.what:I
       4: istore_2
       5: iload_2
       6: iconst_1
       7: if_icmpeq     64
      10: iload_2
      11: tableswitch   { // -3 to -1
                    -3: 37
                    -2: 37
                    -1: 37
               default: 36
          }
      36: return
      37: aload_1
      38: getfield      #35                 // Field android/os/Message.obj:Ljava/lang/Object;
      41: checkcast     #37                 // class android/content/DialogInterface$OnClickListener
      44: aload_0
      45: getfield      #22                 // Field a:Ljava/lang/ref/WeakReference;
      48: invokevirtual #41                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      51: checkcast     #43                 // class android/content/DialogInterface
      54: aload_1
      55: getfield      #31                 // Field android/os/Message.what:I
      58: invokeinterface #47,  3           // InterfaceMethod android/content/DialogInterface$OnClickListener.onClick:(Landroid/content/DialogInterface;I)V
      63: return
      64: aload_1
      65: getfield      #35                 // Field android/os/Message.obj:Ljava/lang/Object;
      68: checkcast     #43                 // class android/content/DialogInterface
      71: invokeinterface #50,  1           // InterfaceMethod android/content/DialogInterface.dismiss:()V
      76: return
}
