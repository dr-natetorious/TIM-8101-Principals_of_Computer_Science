class ryey.easer.plugins.event.d.f$2$3 implements android.content.DialogInterface$OnClickListener {
  final android.widget.SimpleCursorAdapter a;

  final ryey.easer.plugins.event.d.f$2 b;

  ryey.easer.plugins.event.d.f$2$3(ryey.easer.plugins.event.d.f$2, android.widget.SimpleCursorAdapter);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Lryey/easer/plugins/event/d/f$2;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Landroid/widget/SimpleCursorAdapter;
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public void onClick(android.content.DialogInterface, int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/widget/SimpleCursorAdapter;
       4: iload_2
       5: invokevirtual #32                 // Method android/widget/SimpleCursorAdapter.getItem:(I)Ljava/lang/Object;
       8: checkcast     #34                 // class android/database/Cursor
      11: astore_1
      12: aload_1
      13: iconst_0
      14: invokeinterface #38,  2           // InterfaceMethod android/database/Cursor.getLong:(I)J
      19: lstore_3
      20: aload_1
      21: iconst_2
      22: invokeinterface #42,  2           // InterfaceMethod android/database/Cursor.getString:(I)Ljava/lang/String;
      27: astore_1
      28: new           #44                 // class android/content/Intent
      31: dup
      32: ldc           #46                 // String ryey.easer.plugins.event.bluetooth_device.return_from_dialog
      34: invokespecial #49                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
      37: astore        5
      39: aload         5
      41: ldc           #51                 // String ryey.easer.plugins.event.calendar.extra.calendar_id
      43: lload_3
      44: invokevirtual #55                 // Method android/content/Intent.putExtra:(Ljava/lang/String;J)Landroid/content/Intent;
      47: pop
      48: aload         5
      50: ldc           #57                 // String ryey.easer.plugins.event.calendar.extra.calendar_name
      52: aload_1
      53: invokevirtual #60                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
      56: pop
      57: aload_0
      58: getfield      #19                 // Field b:Lryey/easer/plugins/event/d/f$2;
      61: getfield      #63                 // Field ryey/easer/plugins/event/d/f$2.a:Lryey/easer/plugins/event/d/f;
      64: invokevirtual #69                 // Method ryey/easer/plugins/event/d/f.getContext:()Landroid/content/Context;
      67: aload         5
      69: invokevirtual #75                 // Method android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
      72: return
}
