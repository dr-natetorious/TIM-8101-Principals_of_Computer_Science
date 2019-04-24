class ryey.easer.core.ui.data.event.EventPluginViewPager$a extends android.support.v4.app.t {
  android.util.SparseArray<ryey.easer.core.ui.data.event.b> a;

  final java.lang.String[] b;

  final ryey.easer.core.ui.data.event.EventPluginViewPager c;

  public ryey.easer.core.ui.data.event.EventPluginViewPager$a(ryey.easer.core.ui.data.event.EventPluginViewPager, android.support.v4.app.n, android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field c:Lryey/easer/core/ui/data/event/EventPluginViewPager;
       5: aload_0
       6: aload_2
       7: invokespecial #22                 // Method android/support/v4/app/t."<init>":(Landroid/support/v4/app/n;)V
      10: aload_0
      11: new           #24                 // class android/util/SparseArray
      14: dup
      15: invokespecial #27                 // Method android/util/SparseArray."<init>":()V
      18: putfield      #29                 // Field a:Landroid/util/SparseArray;
      21: aload_0
      22: aload_3
      23: putfield      #31                 // Field d:Landroid/content/Context;
      26: aload_0
      27: aload_1
      28: getfield      #34                 // Field ryey/easer/core/ui/data/event/EventPluginViewPager.b:Ljava/util/List;
      31: invokeinterface #40,  1           // InterfaceMethod java/util/List.size:()I
      36: anewarray     #42                 // class java/lang/String
      39: putfield      #44                 // Field b:[Ljava/lang/String;
      42: iconst_0
      43: istore        4
      45: iload         4
      47: aload_1
      48: getfield      #34                 // Field ryey/easer/core/ui/data/event/EventPluginViewPager.b:Ljava/util/List;
      51: invokeinterface #40,  1           // InterfaceMethod java/util/List.size:()I
      56: if_icmpge     101
      59: aload_0
      60: getfield      #44                 // Field b:[Ljava/lang/String;
      63: iload         4
      65: aload_1
      66: getfield      #34                 // Field ryey/easer/core/ui/data/event/EventPluginViewPager.b:Ljava/util/List;
      69: iload         4
      71: invokeinterface #48,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      76: checkcast     #50                 // class ryey/easer/commons/local_plugin/eventplugin/b
      79: invokeinterface #53,  1           // InterfaceMethod ryey/easer/commons/local_plugin/eventplugin/b.d:()Lryey/easer/commons/local_plugin/e;
      84: aload_1
      85: invokevirtual #57                 // Method ryey/easer/core/ui/data/event/EventPluginViewPager.getResources:()Landroid/content/res/Resources;
      88: invokevirtual #62                 // Method ryey/easer/commons/local_plugin/e.a:(Landroid/content/res/Resources;)Ljava/lang/String;
      91: aastore
      92: iload         4
      94: iconst_1
      95: iadd
      96: istore        4
      98: goto          45
     101: return

  public android.support.v4.app.i a(int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field c:Lryey/easer/core/ui/data/event/EventPluginViewPager;
       4: getfield      #34                 // Field ryey/easer/core/ui/data/event/EventPluginViewPager.b:Ljava/util/List;
       7: iload_1
       8: invokeinterface #48,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      13: checkcast     #50                 // class ryey/easer/commons/local_plugin/eventplugin/b
      16: invokestatic  #69                 // Method ryey/easer/core/ui/data/event/b.a:(Lryey/easer/commons/local_plugin/eventplugin/b;)Lryey/easer/core/ui/data/event/b;
      19: areturn

  public ryey.easer.core.ui.data.event.b b(int);
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Landroid/util/SparseArray;
       4: iload_1
       5: invokevirtual #71                 // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
       8: checkcast     #66                 // class ryey/easer/core/ui/data/event/b
      11: areturn

  public void destroyItem(android.view.ViewGroup, int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Landroid/util/SparseArray;
       4: iload_2
       5: invokevirtual #77                 // Method android/util/SparseArray.remove:(I)V
       8: aload_0
       9: aload_1
      10: iload_2
      11: aload_3
      12: invokespecial #79                 // Method android/support/v4/app/t.destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
      15: return

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #44                 // Field b:[Ljava/lang/String;
       4: arraylength
       5: ireturn

  public java.lang.CharSequence getPageTitle(int);
    Code:
       0: aload_0
       1: getfield      #44                 // Field b:[Ljava/lang/String;
       4: iload_1
       5: aaload
       6: areturn

  public java.lang.Object instantiateItem(android.view.ViewGroup, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #86                 // Method android/support/v4/app/t.instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;
       6: checkcast     #66                 // class ryey/easer/core/ui/data/event/b
       9: astore_3
      10: aload_0
      11: getfield      #19                 // Field c:Lryey/easer/core/ui/data/event/EventPluginViewPager;
      14: astore_1
      15: aload_1
      16: monitorenter
      17: aload_0
      18: getfield      #19                 // Field c:Lryey/easer/core/ui/data/event/EventPluginViewPager;
      21: getfield      #89                 // Field ryey/easer/core/ui/data/event/EventPluginViewPager.c:Ljava/lang/Integer;
      24: ifnull        52
      27: iload_2
      28: aload_0
      29: getfield      #19                 // Field c:Lryey/easer/core/ui/data/event/EventPluginViewPager;
      32: getfield      #89                 // Field ryey/easer/core/ui/data/event/EventPluginViewPager.c:Ljava/lang/Integer;
      35: invokevirtual #94                 // Method java/lang/Integer.intValue:()I
      38: if_icmpne     52
      41: aload_3
      42: aload_0
      43: getfield      #19                 // Field c:Lryey/easer/core/ui/data/event/EventPluginViewPager;
      46: getfield      #97                 // Field ryey/easer/core/ui/data/event/EventPluginViewPager.d:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      49: invokevirtual #100                // Method ryey/easer/core/ui/data/event/b.b:(Ljava/lang/Object;)V
      52: aload_1
      53: monitorexit
      54: aload_0
      55: getfield      #29                 // Field a:Landroid/util/SparseArray;
      58: iload_2
      59: aload_3
      60: invokevirtual #104                // Method android/util/SparseArray.put:(ILjava/lang/Object;)V
      63: aload_3
      64: areturn
      65: astore_3
      66: aload_1
      67: monitorexit
      68: aload_3
      69: athrow
    Exception table:
       from    to  target type
          17    52    65   any
          52    54    65   any
          66    68    65   any
}
