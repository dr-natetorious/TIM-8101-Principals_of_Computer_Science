class ryey.easer.core.ui.b$4 implements android.view.View$OnClickListener {
  final ryey.easer.core.ui.b a;

  ryey.easer.core.ui.b$4(ryey.easer.core.ui.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/ui/b;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lryey/easer/core/ui/b;
       4: invokevirtual #27                 // Method ryey/easer/core/ui/b.getActivity:()Landroid/support/v4/app/j;
       7: ldc           #28                 // int 2131296492
       9: invokevirtual #34                 // Method android/support/v4/app/j.findViewById:(I)Landroid/view/View;
      12: checkcast     #36                 // class android/support/design/widget/NavigationView
      15: ldc           #37                 // int 2131296485
      17: invokevirtual #41                 // Method android/support/design/widget/NavigationView.setCheckedItem:(I)V
      20: aload_0
      21: getfield      #17                 // Field a:Lryey/easer/core/ui/b;
      24: invokevirtual #45                 // Method ryey/easer/core/ui/b.getContext:()Landroid/content/Context;
      27: checkcast     #47                 // class ryey/easer/core/ui/MainActivity
      30: ldc           #37                 // int 2131296485
      32: invokevirtual #49                 // Method ryey/easer/core/ui/MainActivity.a:(I)V
      35: return
}
