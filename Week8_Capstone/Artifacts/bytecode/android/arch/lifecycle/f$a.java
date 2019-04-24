class android.arch.lifecycle.f$a {
  android.arch.lifecycle.c$b a;

  android.arch.lifecycle.GenericLifecycleObserver b;

  android.arch.lifecycle.f$a(android.arch.lifecycle.d, android.arch.lifecycle.c$b);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #20                 // Method android/arch/lifecycle/h.a:(Ljava/lang/Object;)Landroid/arch/lifecycle/GenericLifecycleObserver;
       9: putfield      #22                 // Field b:Landroid/arch/lifecycle/GenericLifecycleObserver;
      12: aload_0
      13: aload_2
      14: putfield      #24                 // Field a:Landroid/arch/lifecycle/c$b;
      17: return

  void a(android.arch.lifecycle.e, android.arch.lifecycle.c$a);
    Code:
       0: aload_2
       1: invokestatic  #29                 // Method android/arch/lifecycle/f.b:(Landroid/arch/lifecycle/c$a;)Landroid/arch/lifecycle/c$b;
       4: astore_3
       5: aload_0
       6: aload_0
       7: getfield      #24                 // Field a:Landroid/arch/lifecycle/c$b;
      10: aload_3
      11: invokestatic  #32                 // Method android/arch/lifecycle/f.a:(Landroid/arch/lifecycle/c$b;Landroid/arch/lifecycle/c$b;)Landroid/arch/lifecycle/c$b;
      14: putfield      #24                 // Field a:Landroid/arch/lifecycle/c$b;
      17: aload_0
      18: getfield      #22                 // Field b:Landroid/arch/lifecycle/GenericLifecycleObserver;
      21: aload_1
      22: aload_2
      23: invokeinterface #36,  3           // InterfaceMethod android/arch/lifecycle/GenericLifecycleObserver.a:(Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/c$a;)V
      28: aload_0
      29: aload_3
      30: putfield      #24                 // Field a:Landroid/arch/lifecycle/c$b;
      33: return
}
