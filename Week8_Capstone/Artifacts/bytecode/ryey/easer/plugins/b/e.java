public class ryey.easer.plugins.b.e extends android.support.v4.app.h {
  public ryey.easer.plugins.b.e();
    Code:
       0: aload_0
       1: invokespecial #29                 // Method android/support/v4/app/h."<init>":()V
       4: aload_0
       5: new           #8                  // class ryey/easer/plugins/b/e$a
       8: dup
       9: aload_0
      10: aconst_null
      11: invokespecial #32                 // Method ryey/easer/plugins/b/e$a."<init>":(Lryey/easer/plugins/b/e;Lryey/easer/plugins/b/e$1;)V
      14: putfield      #34                 // Field k:Lryey/easer/plugins/b/e$a;
      17: aload_0
      18: new           #36                 // class java/util/ArrayList
      21: dup
      22: invokespecial #37                 // Method java/util/ArrayList."<init>":()V
      25: putfield      #39                 // Field l:Ljava/util/List;
      28: return

  static java.util.List a(ryey.easer.plugins.b.e);
    Code:
       0: aload_0
       1: getfield      #39                 // Field l:Ljava/util/List;
       4: areturn

  static void a(java.util.List, android.widget.ArrayAdapter, ryey.easer.plugins.b.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokestatic  #44                 // Method b:(Ljava/util/List;Landroid/widget/ArrayAdapter;Lryey/easer/plugins/b/b;)V
       6: return

  static void a(ryey.easer.plugins.b.e, ryey.easer.plugins.b.b);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #50                 // Method a:(Lryey/easer/plugins/b/b;)V
       5: return

  public android.app.Dialog a(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #69                 // Field j:Landroid/telephony/TelephonyManager;
       4: ifnonnull     24
       7: aload_0
       8: invokevirtual #73                 // Method getContext:()Landroid/content/Context;
      11: ldc           #74                 // int 2131624011
      13: iconst_0
      14: invokestatic  #80                 // Method android/widget/Toast.makeText:(Landroid/content/Context;II)Landroid/widget/Toast;
      17: invokevirtual #83                 // Method android/widget/Toast.show:()V
      20: aload_0
      21: invokevirtual #85                 // Method a:()V
      24: new           #87                 // class android/support/v7/app/d$a
      27: dup
      28: aload_0
      29: invokevirtual #73                 // Method getContext:()Landroid/content/Context;
      32: invokespecial #90                 // Method android/support/v7/app/d$a."<init>":(Landroid/content/Context;)V
      35: astore_1
      36: aload_0
      37: invokevirtual #73                 // Method getContext:()Landroid/content/Context;
      40: invokestatic  #96                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      43: ldc           #97                 // int 2131427397
      45: aconst_null
      46: invokevirtual #101                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;)Landroid/view/View;
      49: astore_2
      50: aload_2
      51: ldc           #102                // int 2131296469
      53: invokevirtual #108                // Method android/view/View.findViewById:(I)Landroid/view/View;
      56: checkcast     #110                // class android/widget/ListView
      59: astore_3
      60: aload_0
      61: new           #61                 // class android/widget/ArrayAdapter
      64: dup
      65: aload_0
      66: invokevirtual #73                 // Method getContext:()Landroid/content/Context;
      69: ldc           #111                // int 17367043
      71: aload_0
      72: getfield      #39                 // Field l:Ljava/util/List;
      75: invokespecial #114                // Method android/widget/ArrayAdapter."<init>":(Landroid/content/Context;ILjava/util/List;)V
      78: putfield      #47                 // Field m:Landroid/widget/ArrayAdapter;
      81: aload_3
      82: aload_0
      83: getfield      #47                 // Field m:Landroid/widget/ArrayAdapter;
      86: invokevirtual #118                // Method android/widget/ListView.setAdapter:(Landroid/widget/ListAdapter;)V
      89: aload_1
      90: aload_2
      91: invokevirtual #121                // Method android/support/v7/app/d$a.b:(Landroid/view/View;)Landroid/support/v7/app/d$a;
      94: ldc           #122                // int 2131623989
      96: new           #6                  // class ryey/easer/plugins/b/e$1
      99: dup
     100: aload_0
     101: invokespecial #125                // Method ryey/easer/plugins/b/e$1."<init>":(Lryey/easer/plugins/b/e;)V
     104: invokevirtual #128                // Method android/support/v7/app/d$a.a:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/d$a;
     107: pop
     108: aload_1
     109: invokevirtual #131                // Method android/support/v7/app/d$a.b:()Landroid/support/v7/app/d;
     112: astore_1
     113: new           #11                 // class ryey/easer/plugins/b/e$b
     116: dup
     117: aload_0
     118: getfield      #69                 // Field j:Landroid/telephony/TelephonyManager;
     121: aload_0
     122: getfield      #39                 // Field l:Ljava/util/List;
     125: aload_0
     126: getfield      #47                 // Field m:Landroid/widget/ArrayAdapter;
     129: aconst_null
     130: invokespecial #134                // Method ryey/easer/plugins/b/e$b."<init>":(Landroid/telephony/TelephonyManager;Ljava/util/List;Landroid/widget/ArrayAdapter;Lryey/easer/plugins/b/e$1;)V
     133: iconst_0
     134: anewarray     #136                // class java/lang/Void
     137: invokevirtual #140                // Method ryey/easer/plugins/b/e$b.execute:([Ljava/lang/Object;)Landroid/os/AsyncTask;
     140: pop
     141: aload_1
     142: areturn

  public void onAttach(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #143                // Method android/support/v4/app/h.onAttach:(Landroid/content/Context;)V
       5: aload_0
       6: aload_1
       7: ldc           #145                // String phone
       9: invokevirtual #151                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      12: checkcast     #153                // class android/telephony/TelephonyManager
      15: putfield      #69                 // Field j:Landroid/telephony/TelephonyManager;
      18: aload_0
      19: getfield      #69                 // Field j:Landroid/telephony/TelephonyManager;
      22: ifnull        38
      25: aload_0
      26: getfield      #69                 // Field j:Landroid/telephony/TelephonyManager;
      29: aload_0
      30: getfield      #34                 // Field k:Lryey/easer/plugins/b/e$a;
      33: bipush        16
      35: invokevirtual #157                // Method android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
      38: return

  public void onDetach();
    Code:
       0: aload_0
       1: invokespecial #160                // Method android/support/v4/app/h.onDetach:()V
       4: aload_0
       5: getfield      #69                 // Field j:Landroid/telephony/TelephonyManager;
       8: ifnull        23
      11: aload_0
      12: getfield      #69                 // Field j:Landroid/telephony/TelephonyManager;
      15: aload_0
      16: getfield      #34                 // Field k:Lryey/easer/plugins/b/e$a;
      19: iconst_0
      20: invokevirtual #157                // Method android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
      23: return
}
