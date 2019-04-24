public final class ryey.easer.core.EaserStatusWidget extends android.appwidget.AppWidgetProvider {
  public static final ryey.easer.core.EaserStatusWidget$a a;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/core/EaserStatusWidget$a
       3: dup
       4: aconst_null
       5: invokespecial #14                 // Method ryey/easer/core/EaserStatusWidget$a."<init>":(La/b/b/a;)V
       8: putstatic     #16                 // Field a:Lryey/easer/core/EaserStatusWidget$a;
      11: return

  public ryey.easer.core.EaserStatusWidget();
    Code:
       0: aload_0
       1: invokespecial #19                 // Method android/appwidget/AppWidgetProvider."<init>":()V
       4: return

  public void onDisabled(android.content.Context);
    Code:
       0: aload_1
       1: ldc           #23                 // String context
       3: invokestatic  #29                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: return

  public void onEnabled(android.content.Context);
    Code:
       0: aload_1
       1: ldc           #23                 // String context
       3: invokestatic  #29                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: aconst_null
       1: astore        4
       3: aload_2
       4: ifnull        15
       7: aload_2
       8: invokevirtual #38                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      11: astore_3
      12: goto          17
      15: aconst_null
      16: astore_3
      17: ldc           #40                 // String ryey.easer.core.EaserStatusWidget.ACTION_CLICK
      19: aload_3
      20: invokestatic  #43                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      23: ifne          57
      26: aload         4
      28: astore_3
      29: aload_2
      30: ifnull        38
      33: aload_2
      34: invokevirtual #38                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      37: astore_3
      38: ldc           #45                 // String ryey.easer.action.STATE_CHANGED
      40: aload_3
      41: invokestatic  #43                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      44: ifeq          50
      47: goto          57
      50: aload_0
      51: aload_1
      52: aload_2
      53: invokespecial #47                 // Method android/appwidget/AppWidgetProvider.onReceive:(Landroid/content/Context;Landroid/content/Intent;)V
      56: return
      57: getstatic     #16                 // Field a:Lryey/easer/core/EaserStatusWidget$a;
      60: aload_1
      61: invokestatic  #50                 // Method ryey/easer/core/EaserStatusWidget$a.a:(Lryey/easer/core/EaserStatusWidget$a;Landroid/content/Context;)Landroid/widget/RemoteViews;
      64: astore_2
      65: aload_1
      66: invokestatic  #56                 // Method android/appwidget/AppWidgetManager.getInstance:(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;
      69: new           #58                 // class android/content/ComponentName
      72: dup
      73: aload_1
      74: ldc           #2                  // class ryey/easer/core/EaserStatusWidget
      76: invokespecial #61                 // Method android/content/ComponentName."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      79: aload_2
      80: invokevirtual #65                 // Method android/appwidget/AppWidgetManager.updateAppWidget:(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V
      83: return

  public void onUpdate(android.content.Context, android.appwidget.AppWidgetManager, int[]);
    Code:
       0: aload_1
       1: ldc           #23                 // String context
       3: invokestatic  #29                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #69                 // String appWidgetManager
       9: invokestatic  #29                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_3
      13: ldc           #71                 // String appWidgetIds
      15: invokestatic  #29                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      18: aload_3
      19: arraylength
      20: istore        5
      22: iconst_0
      23: istore        4
      25: iload         4
      27: iload         5
      29: if_icmpge     57
      32: aload_3
      33: iload         4
      35: iaload
      36: istore        6
      38: getstatic     #16                 // Field a:Lryey/easer/core/EaserStatusWidget$a;
      41: aload_1
      42: aload_2
      43: iload         6
      45: invokevirtual #74                 // Method ryey/easer/core/EaserStatusWidget$a.a:(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;I)V
      48: iload         4
      50: iconst_1
      51: iadd
      52: istore        4
      54: goto          25
      57: return
}
