public class ryey.easer.core.ui.data.profile.b$a {
  final java.lang.String a;

  final java.lang.String b;

  final ryey.easer.b.a.a c;

  final ryey.easer.commons.local_plugin.c.d d;

  ryey.easer.core.ui.data.profile.b$a(java.lang.String, java.lang.String, ryey.easer.b.a.a, ryey.easer.commons.local_plugin.c.d);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #20                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #22                 // Field b:Ljava/lang/String;
      14: aload_0
      15: aload_3
      16: putfield      #24                 // Field c:Lryey/easer/b/a/a;
      19: aload_0
      20: aload         4
      22: putfield      #26                 // Field d:Lryey/easer/commons/local_plugin/c/d;
      25: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #26                 // Field d:Lryey/easer/commons/local_plugin/c/d;
       4: ifnonnull     9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #22                 // Field b:Ljava/lang/String;
       4: areturn
}
