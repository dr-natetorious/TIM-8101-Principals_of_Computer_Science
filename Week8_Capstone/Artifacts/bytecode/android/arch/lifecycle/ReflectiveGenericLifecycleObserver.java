class android.arch.lifecycle.ReflectiveGenericLifecycleObserver implements android.arch.lifecycle.GenericLifecycleObserver {
  android.arch.lifecycle.ReflectiveGenericLifecycleObserver(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Ljava/lang/Object;
       9: aload_0
      10: getstatic     #22                 // Field android/arch/lifecycle/a.a:Landroid/arch/lifecycle/a;
      13: aload_0
      14: getfield      #17                 // Field a:Ljava/lang/Object;
      17: invokevirtual #26                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      20: invokevirtual #29                 // Method android/arch/lifecycle/a.b:(Ljava/lang/Class;)Landroid/arch/lifecycle/a$a;
      23: putfield      #31                 // Field b:Landroid/arch/lifecycle/a$a;
      26: return

  public void a(android.arch.lifecycle.e, android.arch.lifecycle.c$a);
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:Landroid/arch/lifecycle/a$a;
       4: aload_1
       5: aload_2
       6: aload_0
       7: getfield      #17                 // Field a:Ljava/lang/Object;
      10: invokevirtual #38                 // Method android/arch/lifecycle/a$a.a:(Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/c$a;Ljava/lang/Object;)V
      13: return
}
