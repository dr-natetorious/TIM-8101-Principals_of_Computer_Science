public final class ryey.easer.core.a.b implements ryey.easer.core.a.f,ryey.easer.core.a.l,ryey.easer.core.a.m {
  final java.lang.String a;

  final ryey.easer.commons.local_plugin.a.a b;

  public ryey.easer.core.a.b(int, java.lang.String, ryey.easer.commons.local_plugin.a.a);
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #23                 // Field c:I
       9: aload_0
      10: aload_2
      11: putfield      #25                 // Field a:Ljava/lang/String;
      14: aload_0
      15: aload_3
      16: putfield      #27                 // Field b:Lryey/easer/commons/local_plugin/a/a;
      19: return

  public java.lang.String a();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Ljava/lang/String;
       4: areturn

  public boolean b();
    Code:
       0: iconst_1
       1: ireturn

  public ryey.easer.commons.local_plugin.a.a c();
    Code:
       0: aload_0
       1: getfield      #27                 // Field b:Lryey/easer/commons/local_plugin/a/a;
       4: areturn

  public int d();
    Code:
       0: aload_0
       1: getfield      #23                 // Field c:I
       4: ireturn
}
