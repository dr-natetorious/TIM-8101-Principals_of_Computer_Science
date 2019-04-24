class android.arch.lifecycle.FullLifecycleObserverAdapter implements android.arch.lifecycle.GenericLifecycleObserver {
  android.arch.lifecycle.FullLifecycleObserverAdapter(android.arch.lifecycle.FullLifecycleObserver);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Landroid/arch/lifecycle/FullLifecycleObserver;
       9: return

  public void a(android.arch.lifecycle.e, android.arch.lifecycle.c$a);
    Code:
       0: getstatic     #22                 // Field android/arch/lifecycle/FullLifecycleObserverAdapter$1.a:[I
       3: aload_2
       4: invokevirtual #28                 // Method android/arch/lifecycle/c$a.ordinal:()I
       7: iaload
       8: tableswitch   { // 1 to 7
                     1: 118
                     2: 107
                     3: 96
                     4: 85
                     5: 74
                     6: 63
                     7: 53
               default: 52
          }
      52: return
      53: new           #30                 // class java/lang/IllegalArgumentException
      56: dup
      57: ldc           #32                 // String ON_ANY must not been send by anybody
      59: invokespecial #35                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      62: athrow
      63: aload_0
      64: getfield      #17                 // Field a:Landroid/arch/lifecycle/FullLifecycleObserver;
      67: aload_1
      68: invokeinterface #41,  2           // InterfaceMethod android/arch/lifecycle/FullLifecycleObserver.f:(Landroid/arch/lifecycle/e;)V
      73: return
      74: aload_0
      75: getfield      #17                 // Field a:Landroid/arch/lifecycle/FullLifecycleObserver;
      78: aload_1
      79: invokeinterface #44,  2           // InterfaceMethod android/arch/lifecycle/FullLifecycleObserver.e:(Landroid/arch/lifecycle/e;)V
      84: return
      85: aload_0
      86: getfield      #17                 // Field a:Landroid/arch/lifecycle/FullLifecycleObserver;
      89: aload_1
      90: invokeinterface #47,  2           // InterfaceMethod android/arch/lifecycle/FullLifecycleObserver.d:(Landroid/arch/lifecycle/e;)V
      95: return
      96: aload_0
      97: getfield      #17                 // Field a:Landroid/arch/lifecycle/FullLifecycleObserver;
     100: aload_1
     101: invokeinterface #50,  2           // InterfaceMethod android/arch/lifecycle/FullLifecycleObserver.c:(Landroid/arch/lifecycle/e;)V
     106: return
     107: aload_0
     108: getfield      #17                 // Field a:Landroid/arch/lifecycle/FullLifecycleObserver;
     111: aload_1
     112: invokeinterface #53,  2           // InterfaceMethod android/arch/lifecycle/FullLifecycleObserver.b:(Landroid/arch/lifecycle/e;)V
     117: return
     118: aload_0
     119: getfield      #17                 // Field a:Landroid/arch/lifecycle/FullLifecycleObserver;
     122: aload_1
     123: invokeinterface #55,  2           // InterfaceMethod android/arch/lifecycle/FullLifecycleObserver.a:(Landroid/arch/lifecycle/e;)V
     128: return
}
