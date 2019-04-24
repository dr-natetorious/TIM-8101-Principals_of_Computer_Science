public class ryey.easer.plugins.event.h.d extends ryey.easer.plugins.c<ryey.easer.plugins.event.h.a> {
  public ryey.easer.plugins.event.h.d();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #49                 // Method b:()Lryey/easer/plugins/event/h/a;
       4: areturn

  protected void a(ryey.easer.plugins.event.h.a);
    Code:
       0: aload_0
       1: getfield      #52                 // Field a:Landroid/widget/DatePicker;
       4: aload_1
       5: getfield      #57                 // Field ryey/easer/plugins/event/h/a.a:Ljava/util/Calendar;
       8: invokestatic  #59                 // Method a:(Landroid/widget/DatePicker;Ljava/util/Calendar;)V
      11: return

  public ryey.easer.plugins.event.h.a b();
    Code:
       0: new           #54                 // class ryey/easer/plugins/event/h/a
       3: dup
       4: aload_0
       5: getfield      #52                 // Field a:Landroid/widget/DatePicker;
       8: invokestatic  #61                 // Method a:(Landroid/widget/DatePicker;)Ljava/util/Calendar;
      11: invokespecial #64                 // Method ryey/easer/plugins/event/h/a."<init>":(Ljava/util/Calendar;)V
      14: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #54                 // class ryey/easer/plugins/event/h/a
       5: invokevirtual #67                 // Method a:(Lryey/easer/plugins/event/h/a;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_0
       1: new           #21                 // class android/widget/DatePicker
       4: dup
       5: aload_0
       6: invokevirtual #73                 // Method getContext:()Landroid/content/Context;
       9: invokespecial #76                 // Method android/widget/DatePicker."<init>":(Landroid/content/Context;)V
      12: putfield      #52                 // Field a:Landroid/widget/DatePicker;
      15: aload_0
      16: getfield      #52                 // Field a:Landroid/widget/DatePicker;
      19: areturn
}
