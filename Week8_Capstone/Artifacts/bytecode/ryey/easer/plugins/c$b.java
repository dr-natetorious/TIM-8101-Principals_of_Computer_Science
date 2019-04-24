class ryey.easer.plugins.c$b extends ryey.easer.commons.b {
  final ryey.easer.plugins.c a;

  ryey.easer.plugins.c$b(ryey.easer.plugins.c, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Lryey/easer/plugins/c;
       5: aload_0
       6: iconst_2
       7: aload_2
       8: invokespecial #17                 // Method ryey/easer/commons/b."<init>":(ILjava/lang/String;)V
      11: aload_0
      12: iconst_1
      13: putfield      #19                 // Field b:Z
      16: return

  static boolean a(ryey.easer.plugins.c$b, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #19                 // Field b:Z
       5: iload_1
       6: ireturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Lryey/easer/plugins/c;
       4: invokevirtual #26                 // Method ryey/easer/plugins/c.getView:()Landroid/view/View;
       7: aload_0
       8: getfield      #19                 // Field b:Z
      11: invokestatic  #29                 // Method ryey/easer/plugins/c.a:(Landroid/view/View;Z)V
      14: return
}
