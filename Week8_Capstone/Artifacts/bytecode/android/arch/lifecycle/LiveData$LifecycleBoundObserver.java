class android.arch.lifecycle.LiveData$LifecycleBoundObserver extends android.arch.lifecycle.LiveData<T>.a implements android.arch.lifecycle.GenericLifecycleObserver {
  final android.arch.lifecycle.e a;

  final android.arch.lifecycle.LiveData b;

  android.arch.lifecycle.LiveData$LifecycleBoundObserver(android.arch.lifecycle.e, android.arch.lifecycle.k<T>);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field b:Landroid/arch/lifecycle/LiveData;
       5: aload_0
       6: aload_1
       7: aload_3
       8: invokespecial #21                 // Method android/arch/lifecycle/LiveData$a."<init>":(Landroid/arch/lifecycle/LiveData;Landroid/arch/lifecycle/k;)V
      11: aload_0
      12: aload_2
      13: putfield      #23                 // Field a:Landroid/arch/lifecycle/e;
      16: return

  public void a(android.arch.lifecycle.e, android.arch.lifecycle.c$a);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/arch/lifecycle/e;
       4: invokeinterface #33,  1           // InterfaceMethod android/arch/lifecycle/e.getLifecycle:()Landroid/arch/lifecycle/c;
       9: invokevirtual #38                 // Method android/arch/lifecycle/c.a:()Landroid/arch/lifecycle/c$b;
      12: getstatic     #43                 // Field android/arch/lifecycle/c$b.a:Landroid/arch/lifecycle/c$b;
      15: if_acmpne     30
      18: aload_0
      19: getfield      #18                 // Field b:Landroid/arch/lifecycle/LiveData;
      22: aload_0
      23: getfield      #47                 // Field c:Landroid/arch/lifecycle/k;
      26: invokevirtual #50                 // Method android/arch/lifecycle/LiveData.a:(Landroid/arch/lifecycle/k;)V
      29: return
      30: aload_0
      31: aload_0
      32: invokevirtual #53                 // Method a:()Z
      35: invokevirtual #56                 // Method a:(Z)V
      38: return

  boolean a();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/arch/lifecycle/e;
       4: invokeinterface #33,  1           // InterfaceMethod android/arch/lifecycle/e.getLifecycle:()Landroid/arch/lifecycle/c;
       9: invokevirtual #38                 // Method android/arch/lifecycle/c.a:()Landroid/arch/lifecycle/c$b;
      12: getstatic     #59                 // Field android/arch/lifecycle/c$b.d:Landroid/arch/lifecycle/c$b;
      15: invokevirtual #62                 // Method android/arch/lifecycle/c$b.a:(Landroid/arch/lifecycle/c$b;)Z
      18: ireturn

  boolean a(android.arch.lifecycle.e);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/arch/lifecycle/e;
       4: aload_1
       5: if_acmpne     10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  void b();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/arch/lifecycle/e;
       4: invokeinterface #33,  1           // InterfaceMethod android/arch/lifecycle/e.getLifecycle:()Landroid/arch/lifecycle/c;
       9: aload_0
      10: invokevirtual #67                 // Method android/arch/lifecycle/c.b:(Landroid/arch/lifecycle/d;)V
      13: return
}
