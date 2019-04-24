public class ryey.easer.plugins.event.d.f extends ryey.easer.plugins.c<ryey.easer.plugins.event.d.b> {
  public ryey.easer.plugins.event.d.f();
    Code:
       0: aload_0
       1: invokespecial #29                 // Method ryey/easer/plugins/c."<init>":()V
       4: aload_0
       5: ldc2_w        #30                 // long -1l
       8: putfield      #33                 // Field a:J
      11: aload_0
      12: getstatic     #38                 // Field ryey/easer/plugins/event/d/a.a:[Ljava/lang/String;
      15: arraylength
      16: anewarray     #40                 // class android/widget/CheckBox
      19: putfield      #42                 // Field c:[Landroid/widget/CheckBox;
      22: aload_0
      23: new           #44                 // class android/content/IntentFilter
      26: dup
      27: ldc           #46                 // String ryey.easer.plugins.event.bluetooth_device.return_from_dialog
      29: invokespecial #49                 // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      32: putfield      #51                 // Field d:Landroid/content/IntentFilter;
      35: aload_0
      36: new           #7                  // class ryey/easer/plugins/event/d/f$1
      39: dup
      40: aload_0
      41: invokespecial #54                 // Method ryey/easer/plugins/event/d/f$1."<init>":(Lryey/easer/plugins/event/d/f;)V
      44: putfield      #56                 // Field e:Landroid/content/BroadcastReceiver;
      47: return

  static long a(ryey.easer.plugins.event.d.f, long);
    Code:
       0: aload_0
       1: lload_1
       2: putfield      #33                 // Field a:J
       5: lload_1
       6: lreturn

  static android.widget.TextView a(ryey.easer.plugins.event.d.f);
    Code:
       0: aload_0
       1: getfield      #61                 // Field b:Landroid/widget/TextView;
       4: areturn

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #65                 // Method b:()Lryey/easer/plugins/event/d/b;
       4: areturn

  protected void a(ryey.easer.plugins.event.d.b);
    Code:
       0: aload_1
       1: getfield      #71                 // Field ryey/easer/plugins/event/d/b.a:Lryey/easer/plugins/event/d/a;
       4: astore_1
       5: aload_0
       6: aload_1
       7: getfield      #73                 // Field ryey/easer/plugins/event/d/a.b:J
      10: putfield      #33                 // Field a:J
      13: aload_0
      14: getfield      #61                 // Field b:Landroid/widget/TextView;
      17: aload_0
      18: invokevirtual #77                 // Method getContext:()Landroid/content/Context;
      21: invokevirtual #83                 // Method android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
      24: aload_0
      25: getfield      #33                 // Field a:J
      28: invokestatic  #88                 // Method ryey/easer/plugins/event/d/e.a:(Landroid/content/ContentResolver;J)Ljava/lang/String;
      31: invokevirtual #94                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      34: iconst_0
      35: istore_2
      36: iload_2
      37: getstatic     #38                 // Field ryey/easer/plugins/event/d/a.a:[Ljava/lang/String;
      40: arraylength
      41: if_icmpge     74
      44: aload_0
      45: getfield      #42                 // Field c:[Landroid/widget/CheckBox;
      48: iload_2
      49: aaload
      50: aload_1
      51: getfield      #97                 // Field ryey/easer/plugins/event/d/a.c:Ljava/util/Set;
      54: getstatic     #38                 // Field ryey/easer/plugins/event/d/a.a:[Ljava/lang/String;
      57: iload_2
      58: aaload
      59: invokeinterface #103,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
      64: invokevirtual #107                // Method android/widget/CheckBox.setChecked:(Z)V
      67: iload_2
      68: iconst_1
      69: iadd
      70: istore_2
      71: goto          36
      74: return

  public ryey.easer.plugins.event.d.b b();
    Code:
       0: new           #35                 // class ryey/easer/plugins/event/d/a
       3: dup
       4: invokespecial #108                // Method ryey/easer/plugins/event/d/a."<init>":()V
       7: astore_2
       8: aload_2
       9: aload_0
      10: getfield      #33                 // Field a:J
      13: putfield      #73                 // Field ryey/easer/plugins/event/d/a.b:J
      16: iconst_0
      17: istore_1
      18: iload_1
      19: aload_0
      20: getfield      #42                 // Field c:[Landroid/widget/CheckBox;
      23: arraylength
      24: if_icmpge     61
      27: aload_0
      28: getfield      #42                 // Field c:[Landroid/widget/CheckBox;
      31: iload_1
      32: aaload
      33: invokevirtual #112                // Method android/widget/CheckBox.isChecked:()Z
      36: ifeq          54
      39: aload_2
      40: getfield      #97                 // Field ryey/easer/plugins/event/d/a.c:Ljava/util/Set;
      43: getstatic     #38                 // Field ryey/easer/plugins/event/d/a.a:[Ljava/lang/String;
      46: iload_1
      47: aaload
      48: invokeinterface #115,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      53: pop
      54: iload_1
      55: iconst_1
      56: iadd
      57: istore_1
      58: goto          18
      61: new           #68                 // class ryey/easer/plugins/event/d/b
      64: dup
      65: aload_2
      66: invokespecial #118                // Method ryey/easer/plugins/event/d/b."<init>":(Lryey/easer/plugins/event/d/a;)V
      69: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #68                 // class ryey/easer/plugins/event/d/b
       5: invokevirtual #121                // Method a:(Lryey/easer/plugins/event/d/b;)V
       8: return

  public void onAttach(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #125                // Method ryey/easer/plugins/c.onAttach:(Landroid/content/Context;)V
       5: aload_0
       6: invokevirtual #77                 // Method getContext:()Landroid/content/Context;
       9: aload_0
      10: getfield      #56                 // Field e:Landroid/content/BroadcastReceiver;
      13: aload_0
      14: getfield      #51                 // Field d:Landroid/content/IntentFilter;
      17: invokevirtual #129                // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      20: pop
      21: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #132                // int 2131427432
       3: aload_2
       4: iconst_0
       5: invokevirtual #138                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #139                // int 2131296711
      13: invokevirtual #145                // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #90                 // class android/widget/TextView
      19: putfield      #61                 // Field b:Landroid/widget/TextView;
      22: aload_0
      23: getfield      #42                 // Field c:[Landroid/widget/CheckBox;
      26: iconst_0
      27: aload_1
      28: ldc           #146                // int 2131296339
      30: invokevirtual #145                // Method android/view/View.findViewById:(I)Landroid/view/View;
      33: checkcast     #40                 // class android/widget/CheckBox
      36: aastore
      37: aload_0
      38: getfield      #42                 // Field c:[Landroid/widget/CheckBox;
      41: iconst_1
      42: aload_1
      43: ldc           #147                // int 2131296335
      45: invokevirtual #145                // Method android/view/View.findViewById:(I)Landroid/view/View;
      48: checkcast     #40                 // class android/widget/CheckBox
      51: aastore
      52: aload_1
      53: ldc           #148                // int 2131296323
      55: invokevirtual #145                // Method android/view/View.findViewById:(I)Landroid/view/View;
      58: new           #9                  // class ryey/easer/plugins/event/d/f$2
      61: dup
      62: aload_0
      63: invokespecial #149                // Method ryey/easer/plugins/event/d/f$2."<init>":(Lryey/easer/plugins/event/d/f;)V
      66: invokevirtual #153                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      69: aload_1
      70: areturn

  public void onDetach();
    Code:
       0: aload_0
       1: invokespecial #156                // Method ryey/easer/plugins/c.onDetach:()V
       4: aload_0
       5: invokevirtual #77                 // Method getContext:()Landroid/content/Context;
       8: aload_0
       9: getfield      #56                 // Field e:Landroid/content/BroadcastReceiver;
      12: invokevirtual #160                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      15: return
}
