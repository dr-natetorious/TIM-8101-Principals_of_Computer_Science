public class ryey.easer.core.ui.data.event.EventPluginViewPager extends android.support.v4.view.v {
  ryey.easer.core.ui.data.event.EventPluginViewPager$a a;

  final java.util.List<ryey.easer.commons.local_plugin.eventplugin.b> b;

  java.lang.Integer c;

  ryey.easer.commons.local_plugin.eventplugin.EventData d;

  public ryey.easer.core.ui.data.event.EventPluginViewPager(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #19                 // Method android/support/v4/view/v."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: new           #21                 // class java/util/ArrayList
       9: dup
      10: invokespecial #24                 // Method java/util/ArrayList."<init>":()V
      13: putfield      #26                 // Field b:Ljava/util/List;
      16: aload_0
      17: aconst_null
      18: putfield      #28                 // Field c:Ljava/lang/Integer;
      21: aload_0
      22: aconst_null
      23: putfield      #30                 // Field d:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      26: return

  public ryey.easer.core.ui.data.event.EventPluginViewPager(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #34                 // Method android/support/v4/view/v."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: new           #21                 // class java/util/ArrayList
      10: dup
      11: invokespecial #24                 // Method java/util/ArrayList."<init>":()V
      14: putfield      #26                 // Field b:Ljava/util/List;
      17: aload_0
      18: aconst_null
      19: putfield      #28                 // Field c:Ljava/lang/Integer;
      22: aload_0
      23: aconst_null
      24: putfield      #30                 // Field d:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      27: return

  public ryey.easer.commons.local_plugin.eventplugin.EventData a(int);
    Code:
       0: aload_0
       1: getfield      #71                 // Field a:Lryey/easer/core/ui/data/event/EventPluginViewPager$a;
       4: iload_1
       5: invokevirtual #74                 // Method ryey/easer/core/ui/data/event/EventPluginViewPager$a.b:(I)Lryey/easer/core/ui/data/event/b;
       8: invokevirtual #79                 // Method ryey/easer/core/ui/data/event/b.b:()Lryey/easer/commons/local_plugin/eventplugin/EventData;
      11: areturn

  public void a(android.support.v7.app.e);
    Code:
       0: aload_0
       1: getfield      #26                 // Field b:Ljava/util/List;
       4: invokeinterface #83,  1           // InterfaceMethod java/util/List.clear:()V
       9: aload_0
      10: getfield      #26                 // Field b:Ljava/util/List;
      13: invokestatic  #88                 // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
      16: invokevirtual #91                 // Method ryey/easer/plugins/b.b:()Lryey/easer/plugins/b$c;
      19: aload_1
      20: invokevirtual #96                 // Method ryey/easer/plugins/b$c.a:(Landroid/content/Context;)Ljava/util/List;
      23: invokeinterface #100,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      28: pop
      29: aload_0
      30: new           #6                  // class ryey/easer/core/ui/data/event/EventPluginViewPager$a
      33: dup
      34: aload_0
      35: aload_1
      36: invokevirtual #106                // Method android/support/v7/app/e.getSupportFragmentManager:()Landroid/support/v4/app/n;
      39: aload_0
      40: invokevirtual #110                // Method getContext:()Landroid/content/Context;
      43: invokespecial #113                // Method ryey/easer/core/ui/data/event/EventPluginViewPager$a."<init>":(Lryey/easer/core/ui/data/event/EventPluginViewPager;Landroid/support/v4/app/n;Landroid/content/Context;)V
      46: putfield      #71                 // Field a:Lryey/easer/core/ui/data/event/EventPluginViewPager$a;
      49: aload_0
      50: aload_0
      51: getfield      #71                 // Field a:Lryey/easer/core/ui/data/event/EventPluginViewPager$a;
      54: invokevirtual #117                // Method setAdapter:(Landroid/support/v4/view/q;)V
      57: return

  public ryey.easer.commons.local_plugin.eventplugin.EventData getEventData();
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #121                // Method getCurrentItem:()I
       5: invokevirtual #123                // Method a:(I)Lryey/easer/commons/local_plugin/eventplugin/EventData;
       8: areturn

  public <T extends ryey.easer.commons.local_plugin.eventplugin.EventData> void setEventData(T);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #30                 // Field d:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       5: aload_0
       6: aload_1
       7: invokespecial #127                // Method a:(Lryey/easer/commons/local_plugin/eventplugin/EventData;)I
      10: istore_2
      11: aload_0
      12: iload_2
      13: invokestatic  #133                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      16: putfield      #28                 // Field c:Ljava/lang/Integer;
      19: aload_0
      20: invokevirtual #121                // Method getCurrentItem:()I
      23: iload_2
      24: if_icmpne     58
      27: aload_0
      28: monitorenter
      29: aload_0
      30: getfield      #71                 // Field a:Lryey/easer/core/ui/data/event/EventPluginViewPager$a;
      33: iload_2
      34: invokevirtual #74                 // Method ryey/easer/core/ui/data/event/EventPluginViewPager$a.b:(I)Lryey/easer/core/ui/data/event/b;
      37: astore_1
      38: aload_1
      39: ifnull        50
      42: aload_1
      43: aload_0
      44: getfield      #30                 // Field d:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      47: invokevirtual #136                // Method ryey/easer/core/ui/data/event/b.b:(Ljava/lang/Object;)V
      50: aload_0
      51: monitorexit
      52: return
      53: astore_1
      54: aload_0
      55: monitorexit
      56: aload_1
      57: athrow
      58: aload_0
      59: iload_2
      60: invokevirtual #140                // Method setCurrentItem:(I)V
      63: return
    Exception table:
       from    to  target type
          29    38    53   any
          42    50    53   any
          50    52    53   any
          54    56    53   any
}
