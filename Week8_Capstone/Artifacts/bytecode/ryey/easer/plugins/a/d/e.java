public class ryey.easer.plugins.a.d.e extends ryey.easer.plugins.a.b<ryey.easer.plugins.a.d.a> {
  static {};
    Code:
       0: return

  ryey.easer.plugins.a.d.e(android.content.Context, ryey.easer.plugins.a.d.a, android.app.PendingIntent, android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokespecial #19                 // Method ryey/easer/plugins/a/b."<init>":(Landroid/content/Context;Lryey/easer/commons/local_plugin/a/a;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
       9: aload_0
      10: new           #7                  // class ryey/easer/plugins/a/d/e$a
      13: dup
      14: aload_0
      15: invokespecial #22                 // Method ryey/easer/plugins/a/d/e$a."<init>":(Lryey/easer/plugins/a/d/e;)V
      18: putfield      #24                 // Field b:Lryey/easer/plugins/a/d/e$a;
      21: getstatic     #26                 // Field a:Landroid/telephony/TelephonyManager;
      24: ifnonnull     39
      27: aload_1
      28: ldc           #28                 // String phone
      30: invokevirtual #34                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      33: checkcast     #36                 // class android/telephony/TelephonyManager
      36: putstatic     #26                 // Field a:Landroid/telephony/TelephonyManager;
      39: return

  static java.lang.Boolean a(ryey.easer.plugins.a.d.e, android.telephony.CellLocation);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #66                 // Method a:(Landroid/telephony/CellLocation;)Ljava/lang/Boolean;
       5: areturn

  static void a(ryey.easer.plugins.a.d.e, java.lang.Boolean);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #70                 // Method a:(Ljava/lang/Boolean;)V
       5: return

  public void a();
    Code:
       0: getstatic     #26                 // Field a:Landroid/telephony/TelephonyManager;
       3: aload_0
       4: getfield      #24                 // Field b:Lryey/easer/plugins/a/d/e$a;
       7: bipush        16
       9: invokevirtual #74                 // Method android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
      12: return

  public void b();
    Code:
       0: getstatic     #26                 // Field a:Landroid/telephony/TelephonyManager;
       3: aload_0
       4: getfield      #24                 // Field b:Lryey/easer/plugins/a/d/e$a;
       7: iconst_0
       8: invokevirtual #74                 // Method android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
      11: return

  public java.lang.Boolean c();
    Code:
       0: aload_0
       1: getstatic     #26                 // Field a:Landroid/telephony/TelephonyManager;
       4: invokevirtual #83                 // Method android/telephony/TelephonyManager.getCellLocation:()Landroid/telephony/CellLocation;
       7: invokespecial #66                 // Method a:(Landroid/telephony/CellLocation;)Ljava/lang/Boolean;
      10: areturn
}
