class ryey.easer.core.ui.data.profile.b$b$1 implements java.util.Comparator<ryey.easer.core.ui.data.profile.b$a> {
  final ryey.easer.core.ui.data.profile.b a;

  final ryey.easer.core.ui.data.profile.b$b b;

  ryey.easer.core.ui.data.profile.b$b$1(ryey.easer.core.ui.data.profile.b$b, ryey.easer.core.ui.data.profile.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field b:Lryey/easer/core/ui/data/profile/b$b;
       5: aload_0
       6: aload_2
       7: putfield      #23                 // Field a:Lryey/easer/core/ui/data/profile/b;
      10: aload_0
      11: invokespecial #26                 // Method java/lang/Object."<init>":()V
      14: return

  public int a(ryey.easer.core.ui.data.profile.b$a, ryey.easer.core.ui.data.profile.b$a);
    Code:
       0: aload_1
       1: getfield      #34                 // Field ryey/easer/core/ui/data/profile/b$a.c:Lryey/easer/b/a/a;
       4: invokevirtual #40                 // Method ryey/easer/b/a/a.ordinal:()I
       7: aload_2
       8: getfield      #34                 // Field ryey/easer/core/ui/data/profile/b$a.c:Lryey/easer/b/a/a;
      11: invokevirtual #40                 // Method ryey/easer/b/a/a.ordinal:()I
      14: isub
      15: ireturn

  public int compare(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #30                 // class ryey/easer/core/ui/data/profile/b$a
       5: aload_2
       6: checkcast     #30                 // class ryey/easer/core/ui/data/profile/b$a
       9: invokevirtual #44                 // Method a:(Lryey/easer/core/ui/data/profile/b$a;Lryey/easer/core/ui/data/profile/b$a;)I
      12: ireturn
}
