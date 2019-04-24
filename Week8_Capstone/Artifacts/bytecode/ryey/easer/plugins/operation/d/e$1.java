class ryey.easer.plugins.operation.d.e$1 implements android.view.View$OnClickListener {
  final ryey.easer.plugins.operation.d.e a;

  ryey.easer.plugins.operation.d.e$1(ryey.easer.plugins.operation.d.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/plugins/operation/d/e;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: new           #25                 // class ryey/easer/plugins/operation/d/e$a
       3: dup
       4: invokespecial #26                 // Method ryey/easer/plugins/operation/d/e$a."<init>":()V
       7: astore_1
       8: aload_0
       9: getfield      #17                 // Field a:Lryey/easer/plugins/operation/d/e;
      12: invokevirtual #30                 // Method ryey/easer/plugins/operation/d/e.getChildFragmentManager:()Landroid/support/v4/app/n;
      15: invokevirtual #35                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      18: ldc           #36                 // int 2131296459
      20: aload_1
      21: invokevirtual #41                 // Method android/support/v4/app/u.a:(ILandroid/support/v4/app/i;)Landroid/support/v4/app/u;
      24: invokevirtual #45                 // Method android/support/v4/app/u.c:()I
      27: pop
      28: aload_0
      29: getfield      #17                 // Field a:Lryey/easer/plugins/operation/d/e;
      32: invokestatic  #48                 // Method ryey/easer/plugins/operation/d/e.a:(Lryey/easer/plugins/operation/d/e;)Ljava/util/List;
      35: aload_1
      36: invokeinterface #54,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      41: pop
      42: return
}
