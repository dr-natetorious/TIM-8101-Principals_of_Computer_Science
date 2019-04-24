public class ryey.easer.core.a.h {
  public final ryey.easer.commons.local_plugin.c.b a;

  public final ryey.easer.c.a b;

  public ryey.easer.core.a.h(ryey.easer.c.a);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field b:Lryey/easer/c/a;
       9: aload_0
      10: aconst_null
      11: putfield      #17                 // Field a:Lryey/easer/commons/local_plugin/c/b;
      14: return

  public ryey.easer.core.a.h(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Lryey/easer/commons/local_plugin/c/b;
       9: aload_0
      10: aconst_null
      11: putfield      #15                 // Field b:Lryey/easer/c/a;
      14: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #15                 // Field b:Lryey/easer/c/a;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn
}
