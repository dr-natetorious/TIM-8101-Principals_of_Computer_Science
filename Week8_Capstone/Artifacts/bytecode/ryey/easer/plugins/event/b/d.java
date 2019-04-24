public class ryey.easer.plugins.event.b.d extends ryey.easer.plugins.c<ryey.easer.plugins.event.b.a> {
  public ryey.easer.plugins.event.b.d();
    Code:
       0: aload_0
       1: invokespecial #32                 // Method ryey/easer/plugins/c."<init>":()V
       4: aload_0
       5: ldc           #34                 // String ryey.easer.plugins.event.bluetooth_device.return_from_dialog
       7: putfield      #36                 // Field a:Ljava/lang/String;
      10: aload_0
      11: ldc           #38                 // String ryey.easer.plugins.event.bluetooth_device.extra.hardware_address
      13: putfield      #40                 // Field b:Ljava/lang/String;
      16: aload_0
      17: new           #42                 // class android/content/IntentFilter
      20: dup
      21: ldc           #34                 // String ryey.easer.plugins.event.bluetooth_device.return_from_dialog
      23: invokespecial #45                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      26: putfield      #47                 // Field c:Landroid/content/IntentFilter;
      29: aload_0
      30: new           #7                  // class ryey/easer/plugins/event/b/d$1
      33: dup
      34: aload_0
      35: invokespecial #50                 // Method ryey/easer/plugins/event/b/d$1."<init>":(Lryey/easer/plugins/event/b/d;)V
      38: putfield      #52                 // Field d:Landroid/content/BroadcastReceiver;
      41: return

  static android.content.BroadcastReceiver a(ryey.easer.plugins.event.b.d);
    Code:
       0: aload_0
       1: getfield      #52                 // Field d:Landroid/content/BroadcastReceiver;
       4: areturn

  static void a(ryey.easer.plugins.event.b.d, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #99                 // Method b:(Ljava/lang/String;)V
       5: return

  static android.widget.TextView b(ryey.easer.plugins.event.b.d);
    Code:
       0: aload_0
       1: getfield      #102                // Field f:Landroid/widget/TextView;
       4: areturn

  static java.lang.String b(ryey.easer.plugins.event.b.d, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #105                // Method a:(Ljava/lang/String;)Ljava/lang/String;
       5: areturn

  static android.content.IntentFilter c(ryey.easer.plugins.event.b.d);
    Code:
       0: aload_0
       1: getfield      #47                 // Field c:Landroid/content/IntentFilter;
       4: areturn

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #136                // Method b:()Lryey/easer/plugins/event/b/a;
       4: areturn

  protected void a(ryey.easer.plugins.event.b.a);
    Code:
       0: aload_0
       1: getfield      #107                // Field e:Landroid/widget/EditText;
       4: aload_1
       5: invokevirtual #140                // Method ryey/easer/plugins/event/b/a.toString:()Ljava/lang/String;
       8: invokevirtual #144                // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      11: return

  public ryey.easer.plugins.event.b.a b();
    Code:
       0: new           #139                // class ryey/easer/plugins/event/b/a
       3: dup
       4: aload_0
       5: getfield      #107                // Field e:Landroid/widget/EditText;
       8: invokevirtual #113                // Method android/widget/EditText.getText:()Landroid/text/Editable;
      11: invokevirtual #118                // Method java/lang/Object.toString:()Ljava/lang/String;
      14: ldc           #125                // String \n
      16: invokevirtual #148                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      19: invokespecial #151                // Method ryey/easer/plugins/event/b/a."<init>":([Ljava/lang/String;)V
      22: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #139                // class ryey/easer/plugins/event/b/a
       5: invokevirtual #154                // Method a:(Lryey/easer/plugins/event/b/a;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #157                // int 2131427430
       3: aload_2
       4: iconst_0
       5: invokevirtual #163                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #164                // int 2131296438
      13: invokevirtual #170                // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #109                // class android/widget/EditText
      19: putfield      #107                // Field e:Landroid/widget/EditText;
      22: aload_0
      23: aload_1
      24: ldc           #171                // int 2131296369
      26: invokevirtual #170                // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #173                // class android/widget/TextView
      32: putfield      #102                // Field f:Landroid/widget/TextView;
      35: aload_0
      36: getfield      #107                // Field e:Landroid/widget/EditText;
      39: new           #9                  // class ryey/easer/plugins/event/b/d$2
      42: dup
      43: aload_0
      44: invokespecial #174                // Method ryey/easer/plugins/event/b/d$2."<init>":(Lryey/easer/plugins/event/b/d;)V
      47: invokevirtual #178                // Method android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
      50: aload_1
      51: ldc           #179                // int 2131296347
      53: invokevirtual #170                // Method android/view/View.findViewById:(I)Landroid/view/View;
      56: new           #11                 // class ryey/easer/plugins/event/b/d$3
      59: dup
      60: aload_0
      61: invokespecial #180                // Method ryey/easer/plugins/event/b/d$3."<init>":(Lryey/easer/plugins/event/b/d;)V
      64: invokevirtual #184                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      67: aload_1
      68: areturn
}
