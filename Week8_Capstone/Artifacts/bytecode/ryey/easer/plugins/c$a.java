class ryey.easer.plugins.c$a extends ryey.easer.commons.b {
  final ryey.easer.plugins.c a;

  ryey.easer.plugins.c$a(ryey.easer.plugins.c, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Lryey/easer/plugins/c;
       5: aload_0
       6: iconst_2
       7: aload_2
       8: invokespecial #18                 // Method ryey/easer/commons/b."<init>":(ILjava/lang/String;)V
      11: aload_0
      12: aconst_null
      13: putfield      #20                 // Field b:Lryey/easer/commons/local_plugin/f;
      16: return

  static ryey.easer.commons.local_plugin.f a(ryey.easer.plugins.c$a, ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field b:Lryey/easer/commons/local_plugin/f;
       5: aload_1
       6: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:Lryey/easer/commons/local_plugin/f;
       4: ifnull        18
       7: aload_0
       8: getfield      #15                 // Field a:Lryey/easer/plugins/c;
      11: aload_0
      12: getfield      #20                 // Field b:Lryey/easer/commons/local_plugin/f;
      15: invokevirtual #26                 // Method ryey/easer/plugins/c.b:(Lryey/easer/commons/local_plugin/f;)V
      18: return
}
