class android.support.v7.view.menu.e$1 implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
  final android.support.v7.view.menu.e a;

  android.support.v7.view.menu.e$1(android.support.v7.view.menu.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/view/menu/e;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void onGlobalLayout();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/view/menu/e;
       4: invokevirtual #23                 // Method android/support/v7/view/menu/e.f:()Z
       7: ifeq          119
      10: aload_0
      11: getfield      #14                 // Field a:Landroid/support/v7/view/menu/e;
      14: getfield      #27                 // Field android/support/v7/view/menu/e.b:Ljava/util/List;
      17: invokeinterface #33,  1           // InterfaceMethod java/util/List.size:()I
      22: ifle          119
      25: aload_0
      26: getfield      #14                 // Field a:Landroid/support/v7/view/menu/e;
      29: getfield      #27                 // Field android/support/v7/view/menu/e.b:Ljava/util/List;
      32: iconst_0
      33: invokeinterface #37,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      38: checkcast     #39                 // class android/support/v7/view/menu/e$a
      41: getfield      #42                 // Field android/support/v7/view/menu/e$a.a:Landroid/support/v7/widget/ay;
      44: invokevirtual #47                 // Method android/support/v7/widget/ay.c:()Z
      47: ifne          119
      50: aload_0
      51: getfield      #14                 // Field a:Landroid/support/v7/view/menu/e;
      54: getfield      #50                 // Field android/support/v7/view/menu/e.c:Landroid/view/View;
      57: astore_1
      58: aload_1
      59: ifnull        112
      62: aload_1
      63: invokevirtual #55                 // Method android/view/View.isShown:()Z
      66: ifne          72
      69: goto          112
      72: aload_0
      73: getfield      #14                 // Field a:Landroid/support/v7/view/menu/e;
      76: getfield      #27                 // Field android/support/v7/view/menu/e.b:Ljava/util/List;
      79: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      84: astore_1
      85: aload_1
      86: invokeinterface #64,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      91: ifeq          119
      94: aload_1
      95: invokeinterface #68,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     100: checkcast     #39                 // class android/support/v7/view/menu/e$a
     103: getfield      #42                 // Field android/support/v7/view/menu/e$a.a:Landroid/support/v7/widget/ay;
     106: invokevirtual #71                 // Method android/support/v7/widget/ay.d:()V
     109: goto          85
     112: aload_0
     113: getfield      #14                 // Field a:Landroid/support/v7/view/menu/e;
     116: invokevirtual #74                 // Method android/support/v7/view/menu/e.e:()V
     119: return
}
