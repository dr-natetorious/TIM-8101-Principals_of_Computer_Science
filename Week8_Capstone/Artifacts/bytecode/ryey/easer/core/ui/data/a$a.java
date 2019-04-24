public class ryey.easer.core.ui.data.a$a extends android.widget.ArrayAdapter<ryey.easer.core.ui.data.a$b> {
  ryey.easer.core.ui.data.a$a(android.content.Context, java.util.List<ryey.easer.core.ui.data.a$b>);
    Code:
       0: aload_0
       1: aload_1
       2: ldc           #11                 // int 2131427403
       4: ldc           #12                 // int 2131296707
       6: aload_2
       7: invokespecial #15                 // Method android/widget/ArrayAdapter."<init>":(Landroid/content/Context;IILjava/util/List;)V
      10: return

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aload_3
       4: invokespecial #22                 // Method android/widget/ArrayAdapter.getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
       7: astore_2
       8: aload_0
       9: iload_1
      10: invokevirtual #26                 // Method getItem:(I)Ljava/lang/Object;
      13: checkcast     #28                 // class ryey/easer/core/ui/data/a$b
      16: astore_3
      17: aload_2
      18: ldc           #12                 // int 2131296707
      20: invokevirtual #34                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      23: checkcast     #36                 // class android/widget/TextView
      26: astore        4
      28: aload         4
      30: aload_0
      31: invokevirtual #40                 // Method getContext:()Landroid/content/Context;
      34: aload_3
      35: getfield      #44                 // Field ryey/easer/core/ui/data/a$b.b:I
      38: invokestatic  #50                 // Method android/support/v4/a/a.c:(Landroid/content/Context;I)I
      41: invokevirtual #54                 // Method android/widget/TextView.setTextColor:(I)V
      44: aload         4
      46: aload_3
      47: getfield      #57                 // Field ryey/easer/core/ui/data/a$b.a:Ljava/lang/String;
      50: invokevirtual #61                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      53: aload_2
      54: areturn
}
