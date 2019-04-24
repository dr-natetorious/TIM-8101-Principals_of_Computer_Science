class ryey.easer.core.c$2 implements java.lang.Runnable {
  final ryey.easer.core.c a;

  ryey.easer.core.c$2(ryey.easer.core.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/c;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lryey/easer/core/c;
       4: invokestatic  #24                 // Method ryey/easer/core/c.a:(Lryey/easer/core/c;)Lryey/easer/commons/local_plugin/eventplugin/c;
       7: invokeinterface #27,  1           // InterfaceMethod ryey/easer/commons/local_plugin/eventplugin/c.b:()V
      12: return
}
