class ryey.easer.core.ui.b$1 extends android.content.BroadcastReceiver {
  final ryey.easer.core.ui.b a;

  ryey.easer.core.ui.b$1(ryey.easer.core.ui.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/core/ui/b;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: aload_2
       1: invokevirtual #24                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       4: astore_1
       5: aload_1
       6: invokevirtual #30                 // Method java/lang/String.hashCode:()I
       9: ldc           #31                 // int -1549285109
      11: if_icmpeq     17
      14: goto          31
      17: aload_1
      18: ldc           #33                 // String ryey.easer.action.STATE_CHANGED
      20: invokevirtual #37                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      23: ifeq          31
      26: iconst_0
      27: istore_3
      28: goto          33
      31: iconst_m1
      32: istore_3
      33: iload_3
      34: ifeq          38
      37: return
      38: aload_0
      39: getfield      #12                 // Field a:Lryey/easer/core/ui/b;
      42: invokestatic  #39                 // Method ryey/easer/core/ui/b.a:(Lryey/easer/core/ui/b;)V
      45: return
}
