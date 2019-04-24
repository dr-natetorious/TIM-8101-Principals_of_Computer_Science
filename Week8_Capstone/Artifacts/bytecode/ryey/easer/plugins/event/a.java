public abstract class ryey.easer.plugins.event.a implements ryey.easer.commons.local_plugin.eventplugin.EventData {
  public ryey.easer.plugins.event.a();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method java/lang/Object."<init>":()V
       4: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        16
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/a
       8: ifne          14
      11: goto          16
      14: iconst_1
      15: ireturn
      16: iconst_0
      17: ireturn
}
