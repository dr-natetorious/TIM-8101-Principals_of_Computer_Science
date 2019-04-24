public class ryey.easer.plugins.a.b.d extends ryey.easer.plugins.c<ryey.easer.plugins.a.b.a> {
  public ryey.easer.plugins.a.b.d();
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
      30: new           #7                  // class ryey/easer/plugins/a/b/d$1
      33: dup
      34: aload_0
      35: invokespecial #50                 // Method ryey/easer/plugins/a/b/d$1."<init>":(Lryey/easer/plugins/a/b/d;)V
      38: putfield      #52                 // Field d:Landroid/content/BroadcastReceiver;
      41: return

  static android.content.BroadcastReceiver a(ryey.easer.plugins.a.b.d);
    Code:
       0: aload_0
       1: getfield      #52                 // Field d:Landroid/content/BroadcastReceiver;
       4: areturn

  static void a(ryey.easer.plugins.a.b.d, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #99                 // Method b:(Ljava/lang/String;)V
       5: return

  static android.widget.TextView b(ryey.easer.plugins.a.b.d);
    Code:
       0: aload_0
       1: getfield      #102                // Field f:Landroid/widget/TextView;
       4: areturn

  static java.lang.String b(ryey.easer.plugins.a.b.d, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #105                // Method a:(Ljava/lang/String;)Ljava/lang/String;
       5: areturn

  static android.content.IntentFilter c(ryey.easer.plugins.a.b.d);
    Code:
       0: aload_0
       1: getfield      #47                 // Field c:Landroid/content/IntentFilter;
       4: areturn

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #136                // Method b:()Lryey/easer/plugins/a/b/a;
       4: areturn

  protected void a(ryey.easer.plugins.a.b.a);
    Code:
       0: new           #139                // class java/lang/StringBuilder
       3: dup
       4: invokespecial #140                // Method java/lang/StringBuilder."<init>":()V
       7: astore_3
       8: aload_1
       9: getfield      #145                // Field ryey/easer/plugins/a/b/a.a:Ljava/util/List;
      12: invokeinterface #148,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      17: astore_1
      18: iconst_1
      19: istore_2
      20: aload_1
      21: invokeinterface #77,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      26: ifeq          63
      29: aload_1
      30: invokeinterface #81,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      35: checkcast     #89                 // class java/lang/String
      38: astore        4
      40: iload_2
      41: ifne          51
      44: aload_3
      45: ldc           #125                // String \n
      47: invokevirtual #151                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      50: pop
      51: aload_3
      52: aload         4
      54: invokevirtual #151                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      57: pop
      58: iconst_0
      59: istore_2
      60: goto          20
      63: aload_0
      64: getfield      #107                // Field e:Landroid/widget/EditText;
      67: aload_3
      68: invokevirtual #152                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      71: invokevirtual #156                // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      74: return

  public ryey.easer.plugins.a.b.a b();
    Code:
       0: new           #142                // class ryey/easer/plugins/a/b/a
       3: dup
       4: aload_0
       5: getfield      #107                // Field e:Landroid/widget/EditText;
       8: invokevirtual #113                // Method android/widget/EditText.getText:()Landroid/text/Editable;
      11: invokevirtual #118                // Method java/lang/Object.toString:()Ljava/lang/String;
      14: ldc           #125                // String \n
      16: invokevirtual #160                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      19: invokespecial #163                // Method ryey/easer/plugins/a/b/a."<init>":([Ljava/lang/String;)V
      22: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #142                // class ryey/easer/plugins/a/b/a
       5: invokevirtual #166                // Method a:(Lryey/easer/plugins/a/b/a;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #169                // int 2131427430
       3: aload_2
       4: iconst_0
       5: invokevirtual #175                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #176                // int 2131296438
      13: invokevirtual #182                // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #109                // class android/widget/EditText
      19: putfield      #107                // Field e:Landroid/widget/EditText;
      22: aload_0
      23: aload_1
      24: ldc           #183                // int 2131296369
      26: invokevirtual #182                // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #185                // class android/widget/TextView
      32: putfield      #102                // Field f:Landroid/widget/TextView;
      35: aload_0
      36: getfield      #107                // Field e:Landroid/widget/EditText;
      39: new           #9                  // class ryey/easer/plugins/a/b/d$2
      42: dup
      43: aload_0
      44: invokespecial #186                // Method ryey/easer/plugins/a/b/d$2."<init>":(Lryey/easer/plugins/a/b/d;)V
      47: invokevirtual #190                // Method android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
      50: aload_1
      51: ldc           #191                // int 2131296347
      53: invokevirtual #182                // Method android/view/View.findViewById:(I)Landroid/view/View;
      56: new           #11                 // class ryey/easer/plugins/a/b/d$3
      59: dup
      60: aload_0
      61: invokespecial #192                // Method ryey/easer/plugins/a/b/d$3."<init>":(Lryey/easer/plugins/a/b/d;)V
      64: invokevirtual #196                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      67: aload_1
      68: areturn
}
