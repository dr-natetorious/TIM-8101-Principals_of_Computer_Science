class ryey.easer.plugins.event.l.c implements ryey.easer.commons.local_plugin.eventplugin.a<ryey.easer.plugins.event.l.b> {
  ryey.easer.plugins.event.l.c();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.Class<ryey.easer.plugins.event.l.b> a();
    Code:
       0: ldc           #16                 // class ryey/easer/plugins/event/l/b
       2: areturn

  public ryey.easer.commons.local_plugin.eventplugin.EventData a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokevirtual #23                 // Method b:(Ljava/lang/String;Lryey/easer/b/a;I)Lryey/easer/plugins/event/l/b;
       7: areturn

  public ryey.easer.plugins.event.l.b b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: new           #16                 // class ryey/easer/plugins/event/l/b
       3: dup
       4: aload_1
       5: aload_2
       6: iload_3
       7: invokespecial #26                 // Method ryey/easer/plugins/event/l/b."<init>":(Ljava/lang/String;Lryey/easer/b/a;I)V
      10: areturn
}
