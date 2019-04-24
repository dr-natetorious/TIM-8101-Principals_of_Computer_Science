public abstract class ryey.easer.core.ui.data.h<T extends ryey.easer.commons.local_plugin.f> extends ryey.easer.core.ui.data.c<T> {
  protected ryey.easer.commons.local_plugin.e<T> b;

  public ryey.easer.core.ui.data.h();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method ryey/easer/core/ui/data/c."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #14                 // Field b:Lryey/easer/commons/local_plugin/e;
       9: return

  public T a();
    Code:
       0: aload_0
       1: getfield      #14                 // Field b:Lryey/easer/commons/local_plugin/e;
       4: invokevirtual #21                 // Method ryey/easer/commons/local_plugin/e.a:()Lryey/easer/commons/local_plugin/f;
       7: areturn

  protected void a(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #26                 // class ryey/easer/commons/local_plugin/f
       5: invokevirtual #29                 // Method a:(Lryey/easer/commons/local_plugin/f;)V
       8: return

  protected void a(T);
    Code:
       0: aload_0
       1: getfield      #14                 // Field b:Lryey/easer/commons/local_plugin/e;
       4: aload_1
       5: invokevirtual #30                 // Method ryey/easer/commons/local_plugin/e.a:(Lryey/easer/commons/local_plugin/f;)V
       8: return
}
