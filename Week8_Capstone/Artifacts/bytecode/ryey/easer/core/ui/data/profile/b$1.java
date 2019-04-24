class ryey.easer.core.ui.data.profile.b$1 implements android.widget.AdapterView$OnItemClickListener {
  final ryey.easer.core.ui.data.profile.b a;

  ryey.easer.core.ui.data.profile.b$1(ryey.easer.core.ui.data.profile.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/ui/data/profile/b;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onItemClick(android.widget.AdapterView<?>, android.view.View, int, long);
    Code:
       0: aload_1
       1: iload_3
       2: invokevirtual #29                 // Method android/widget/AdapterView.getItemAtPosition:(I)Ljava/lang/Object;
       5: checkcast     #31                 // class ryey/easer/core/ui/data/profile/b$a
       8: astore_1
       9: aload_1
      10: invokevirtual #34                 // Method ryey/easer/core/ui/data/profile/b$a.a:()Z
      13: ifne          55
      16: aload_1
      17: getfield      #38                 // Field ryey/easer/core/ui/data/profile/b$a.d:Lryey/easer/commons/local_plugin/c/d;
      20: astore_2
      21: aload_2
      22: aload_0
      23: getfield      #17                 // Field a:Lryey/easer/core/ui/data/profile/b;
      26: invokevirtual #42                 // Method ryey/easer/core/ui/data/profile/b.getContext:()Landroid/content/Context;
      29: invokeinterface #48,  2           // InterfaceMethod ryey/easer/commons/local_plugin/c/d.b:(Landroid/content/Context;)Z
      34: ifeq          40
      37: goto          55
      40: aload_2
      41: aload_0
      42: getfield      #17                 // Field a:Lryey/easer/core/ui/data/profile/b;
      45: invokevirtual #52                 // Method ryey/easer/core/ui/data/profile/b.getActivity:()Landroid/support/v4/app/j;
      48: iconst_0
      49: invokeinterface #55,  3           // InterfaceMethod ryey/easer/commons/local_plugin/c/d.a:(Landroid/app/Activity;I)V
      54: return
      55: aload_0
      56: getfield      #17                 // Field a:Lryey/easer/core/ui/data/profile/b;
      59: getfield      #59                 // Field ryey/easer/core/ui/data/profile/b.j:Lryey/easer/core/ui/data/profile/b$c;
      62: aload_1
      63: invokeinterface #64,  2           // InterfaceMethod ryey/easer/core/ui/data/profile/b$c.a:(Lryey/easer/core/ui/data/profile/b$a;)V
      68: aload_0
      69: getfield      #17                 // Field a:Lryey/easer/core/ui/data/profile/b;
      72: invokevirtual #66                 // Method ryey/easer/core/ui/data/profile/b.a:()V
      75: return
}
