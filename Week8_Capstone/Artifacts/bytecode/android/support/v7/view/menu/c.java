abstract class android.support.v7.view.menu.c<T> extends android.support.v7.view.menu.d<T> {
  final android.content.Context a;

  android.support.v7.view.menu.c(android.content.Context, T);
    Code:
       0: aload_0
       1: aload_2
       2: invokespecial #17                 // Method android/support/v7/view/menu/d."<init>":(Ljava/lang/Object;)V
       5: aload_0
       6: aload_1
       7: putfield      #19                 // Field a:Landroid/content/Context;
      10: return

  final android.view.MenuItem a(android.view.MenuItem);
    Code:
       0: aload_1
       1: astore_2
       2: aload_1
       3: instanceof    #25                 // class android/support/v4/c/a/b
       6: ifeq          73
       9: aload_1
      10: checkcast     #25                 // class android/support/v4/c/a/b
      13: astore_3
      14: aload_0
      15: getfield      #27                 // Field c:Ljava/util/Map;
      18: ifnonnull     32
      21: aload_0
      22: new           #29                 // class android/support/v4/g/a
      25: dup
      26: invokespecial #32                 // Method android/support/v4/g/a."<init>":()V
      29: putfield      #27                 // Field c:Ljava/util/Map;
      32: aload_0
      33: getfield      #27                 // Field c:Ljava/util/Map;
      36: aload_1
      37: invokeinterface #38,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      42: checkcast     #40                 // class android/view/MenuItem
      45: astore_1
      46: aload_1
      47: astore_2
      48: aload_1
      49: ifnonnull     73
      52: aload_0
      53: getfield      #19                 // Field a:Landroid/content/Context;
      56: aload_3
      57: invokestatic  #45                 // Method android/support/v7/view/menu/q.a:(Landroid/content/Context;Landroid/support/v4/c/a/b;)Landroid/view/MenuItem;
      60: astore_2
      61: aload_0
      62: getfield      #27                 // Field c:Ljava/util/Map;
      65: aload_3
      66: aload_2
      67: invokeinterface #49,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      72: pop
      73: aload_2
      74: areturn

  final android.view.SubMenu a(android.view.SubMenu);
    Code:
       0: aload_1
       1: instanceof    #52                 // class android/support/v4/c/a/c
       4: ifeq          73
       7: aload_1
       8: checkcast     #52                 // class android/support/v4/c/a/c
      11: astore_3
      12: aload_0
      13: getfield      #54                 // Field d:Ljava/util/Map;
      16: ifnonnull     30
      19: aload_0
      20: new           #29                 // class android/support/v4/g/a
      23: dup
      24: invokespecial #32                 // Method android/support/v4/g/a."<init>":()V
      27: putfield      #54                 // Field d:Ljava/util/Map;
      30: aload_0
      31: getfield      #54                 // Field d:Ljava/util/Map;
      34: aload_3
      35: invokeinterface #38,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      40: checkcast     #56                 // class android/view/SubMenu
      43: astore_2
      44: aload_2
      45: astore_1
      46: aload_2
      47: ifnonnull     71
      50: aload_0
      51: getfield      #19                 // Field a:Landroid/content/Context;
      54: aload_3
      55: invokestatic  #59                 // Method android/support/v7/view/menu/q.a:(Landroid/content/Context;Landroid/support/v4/c/a/c;)Landroid/view/SubMenu;
      58: astore_1
      59: aload_0
      60: getfield      #54                 // Field d:Ljava/util/Map;
      63: aload_3
      64: aload_1
      65: invokeinterface #49,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      70: pop
      71: aload_1
      72: areturn
      73: aload_1
      74: areturn

  final void a();
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Ljava/util/Map;
       4: ifnull        16
       7: aload_0
       8: getfield      #27                 // Field c:Ljava/util/Map;
      11: invokeinterface #62,  1           // InterfaceMethod java/util/Map.clear:()V
      16: aload_0
      17: getfield      #54                 // Field d:Ljava/util/Map;
      20: ifnull        32
      23: aload_0
      24: getfield      #54                 // Field d:Ljava/util/Map;
      27: invokeinterface #62,  1           // InterfaceMethod java/util/Map.clear:()V
      32: return

  final void a(int);
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Ljava/util/Map;
       4: ifnonnull     8
       7: return
       8: aload_0
       9: getfield      #27                 // Field c:Ljava/util/Map;
      12: invokeinterface #67,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
      17: invokeinterface #73,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      22: astore_2
      23: aload_2
      24: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      29: ifeq          59
      32: iload_1
      33: aload_2
      34: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      39: checkcast     #40                 // class android/view/MenuItem
      42: invokeinterface #87,  1           // InterfaceMethod android/view/MenuItem.getGroupId:()I
      47: if_icmpne     23
      50: aload_2
      51: invokeinterface #90,  1           // InterfaceMethod java/util/Iterator.remove:()V
      56: goto          23
      59: return

  final void b(int);
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Ljava/util/Map;
       4: ifnonnull     8
       7: return
       8: aload_0
       9: getfield      #27                 // Field c:Ljava/util/Map;
      12: invokeinterface #67,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
      17: invokeinterface #73,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      22: astore_2
      23: aload_2
      24: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      29: ifeq          56
      32: iload_1
      33: aload_2
      34: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      39: checkcast     #40                 // class android/view/MenuItem
      42: invokeinterface #94,  1           // InterfaceMethod android/view/MenuItem.getItemId:()I
      47: if_icmpne     23
      50: aload_2
      51: invokeinterface #90,  1           // InterfaceMethod java/util/Iterator.remove:()V
      56: return
}
