public final class ryey.easer.core.ui.c$d extends de.blox.graphview.m {
  public ryey.easer.core.ui.c$d(android.view.View);
    Code:
       0: aload_1
       1: ldc           #15                 // String itemView
       3: invokestatic  #20                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_1
       8: invokespecial #22                 // Method de/blox/graphview/m."<init>":(Landroid/view/View;)V
      11: aload_1
      12: ldc           #23                 // int 2131296482
      14: invokevirtual #29                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      17: astore_2
      18: aload_2
      19: ldc           #31                 // String itemView.findViewById(R.id.name)
      21: invokestatic  #34                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      24: aload_0
      25: aload_2
      26: checkcast     #36                 // class android/widget/TextView
      29: putfield      #38                 // Field b:Landroid/widget/TextView;
      32: aload_1
      33: ldc           #39                 // int 2131296411
      35: invokevirtual #29                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      38: astore_2
      39: aload_2
      40: ldc           #41                 // String itemView.findViewById(R.id.extra_script_info)
      42: invokestatic  #34                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      45: aload_0
      46: aload_2
      47: checkcast     #43                 // class android/view/ViewGroup
      50: putfield      #45                 // Field c:Landroid/view/ViewGroup;
      53: aload_1
      54: ldc           #46                 // int 2131296746
      56: invokevirtual #29                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      59: astore_1
      60: aload_1
      61: ldc           #48                 // String itemView.findViewById(R.id.tv_type)
      63: invokestatic  #34                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      66: aload_0
      67: aload_1
      68: checkcast     #36                 // class android/widget/TextView
      71: putfield      #50                 // Field d:Landroid/widget/TextView;
      74: return

  public final android.widget.TextView a();
    Code:
       0: aload_0
       1: getfield      #38                 // Field b:Landroid/widget/TextView;
       4: areturn

  public final void a(int);
    Code:
       0: aload_0
       1: getfield      #56                 // Field a:Landroid/view/View;
       4: iload_1
       5: invokevirtual #59                 // Method android/view/View.setBackgroundColor:(I)V
       8: return

  public final android.view.ViewGroup b();
    Code:
       0: aload_0
       1: getfield      #45                 // Field c:Landroid/view/ViewGroup;
       4: areturn

  public final android.widget.TextView c();
    Code:
       0: aload_0
       1: getfield      #50                 // Field d:Landroid/widget/TextView;
       4: areturn
}
