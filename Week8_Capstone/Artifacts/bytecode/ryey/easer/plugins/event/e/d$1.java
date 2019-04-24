class ryey.easer.plugins.event.e.d$1 implements android.view.View$OnClickListener {
  final ryey.easer.plugins.event.e.d a;

  ryey.easer.plugins.event.e.d$1(ryey.easer.plugins.event.e.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/plugins/event/e/d;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lryey/easer/plugins/event/e/d;
       4: invokevirtual #27                 // Method ryey/easer/plugins/event/e/d.getContext:()Landroid/content/Context;
       7: ldc           #29                 // String android.permission.ACCESS_COARSE_LOCATION
       9: invokestatic  #34                 // Method ryey/easer/b.a:(Landroid/content/Context;Ljava/lang/String;)Z
      12: ifne          16
      15: return
      16: new           #36                 // class ryey/easer/plugins/b/e
      19: dup
      20: invokespecial #37                 // Method ryey/easer/plugins/b/e."<init>":()V
      23: astore_1
      24: aload_1
      25: aload_0
      26: getfield      #17                 // Field a:Lryey/easer/plugins/event/e/d;
      29: iconst_1
      30: invokevirtual #43                 // Method android/support/v4/app/h.setTargetFragment:(Landroid/support/v4/app/i;I)V
      33: aload_1
      34: aload_0
      35: getfield      #17                 // Field a:Lryey/easer/plugins/event/e/d;
      38: invokevirtual #47                 // Method ryey/easer/plugins/event/e/d.getFragmentManager:()Landroid/support/v4/app/n;
      41: ldc           #49                 // String dialog
      43: invokevirtual #52                 // Method android/support/v4/app/h.a:(Landroid/support/v4/app/n;Ljava/lang/String;)V
      46: return
}
