public final class ryey.easer.core.EaserStatusWidget$a {
  public ryey.easer.core.EaserStatusWidget$a(a.b.b.a);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method "<init>":()V
       4: return

  public static final android.widget.RemoteViews a(ryey.easer.core.EaserStatusWidget$a, android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #60                 // Method a:(Landroid/content/Context;)Landroid/widget/RemoteViews;
       5: areturn

  public final void a(android.content.Context, android.appwidget.AppWidgetManager, int);
    Code:
       0: aload_1
       1: ldc           #63                 // String context
       3: invokestatic  #69                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #71                 // String appWidgetManager
       9: invokestatic  #69                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_2
      13: iload_3
      14: aload_0
      15: checkcast     #2                  // class ryey/easer/core/EaserStatusWidget$a
      18: aload_1
      19: invokespecial #60                 // Method a:(Landroid/content/Context;)Landroid/widget/RemoteViews;
      22: invokevirtual #77                 // Method android/appwidget/AppWidgetManager.updateAppWidget:(ILandroid/widget/RemoteViews;)V
      25: return
}
