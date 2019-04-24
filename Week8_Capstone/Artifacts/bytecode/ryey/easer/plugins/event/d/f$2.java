class ryey.easer.plugins.event.d.f$2 implements android.view.View$OnClickListener {
  final ryey.easer.plugins.event.d.f a;

  ryey.easer.plugins.event.d.f$2(ryey.easer.plugins.event.d.f);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #23                 // Field a:Lryey/easer/plugins/event/d/f;
       5: aload_0
       6: invokespecial #26                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Lryey/easer/plugins/event/d/f;
       4: invokevirtual #33                 // Method ryey/easer/plugins/event/d/f.getContext:()Landroid/content/Context;
       7: ldc           #35                 // String android.permission.READ_CALENDAR
       9: invokestatic  #40                 // Method ryey/easer/b.a:(Landroid/content/Context;Ljava/lang/String;)Z
      12: ifne          16
      15: return
      16: new           #42                 // class android/app/AlertDialog$Builder
      19: dup
      20: aload_0
      21: getfield      #23                 // Field a:Lryey/easer/plugins/event/d/f;
      24: invokevirtual #33                 // Method ryey/easer/plugins/event/d/f.getContext:()Landroid/content/Context;
      27: invokespecial #45                 // Method android/app/AlertDialog$Builder."<init>":(Landroid/content/Context;)V
      30: astore_1
      31: aload_1
      32: ldc           #46                 // int 2131624042
      34: invokevirtual #50                 // Method android/app/AlertDialog$Builder.setTitle:(I)Landroid/app/AlertDialog$Builder;
      37: pop
      38: new           #52                 // class android/content/CursorLoader
      41: dup
      42: aload_0
      43: getfield      #23                 // Field a:Lryey/easer/plugins/event/d/f;
      46: invokevirtual #33                 // Method ryey/easer/plugins/event/d/f.getContext:()Landroid/content/Context;
      49: getstatic     #58                 // Field android/provider/CalendarContract$Calendars.CONTENT_URI:Landroid/net/Uri;
      52: iconst_3
      53: anewarray     #60                 // class java/lang/String
      56: dup
      57: iconst_0
      58: ldc           #62                 // String _id
      60: aastore
      61: dup
      62: iconst_1
      63: ldc           #64                 // String account_name
      65: aastore
      66: dup
      67: iconst_2
      68: ldc           #66                 // String calendar_displayName
      70: aastore
      71: aconst_null
      72: aconst_null
      73: aconst_null
      74: invokespecial #69                 // Method android/content/CursorLoader."<init>":(Landroid/content/Context;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
      77: astore_2
      78: new           #13                 // class ryey/easer/plugins/event/d/f$2$1
      81: dup
      82: aload_0
      83: aload_0
      84: getfield      #23                 // Field a:Lryey/easer/plugins/event/d/f;
      87: invokevirtual #33                 // Method ryey/easer/plugins/event/d/f.getContext:()Landroid/content/Context;
      90: ldc           #70                 // int 17367044
      92: aload_2
      93: invokevirtual #74                 // Method android/content/CursorLoader.loadInBackground:()Landroid/database/Cursor;
      96: iconst_2
      97: anewarray     #60                 // class java/lang/String
     100: dup
     101: iconst_0
     102: ldc           #66                 // String calendar_displayName
     104: aastore
     105: dup
     106: iconst_1
     107: ldc           #64                 // String account_name
     109: aastore
     110: iconst_2
     111: newarray       int
     113: dup
     114: iconst_0
     115: ldc           #75                 // int 16908308
     117: iastore
     118: dup
     119: iconst_1
     120: ldc           #76                 // int 16908309
     122: iastore
     123: iconst_0
     124: invokespecial #79                 // Method ryey/easer/plugins/event/d/f$2$1."<init>":(Lryey/easer/plugins/event/d/f$2;Landroid/content/Context;ILandroid/database/Cursor;[Ljava/lang/String;[II)V
     127: astore_3
     128: aload_2
     129: iconst_0
     130: new           #15                 // class ryey/easer/plugins/event/d/f$2$2
     133: dup
     134: aload_0
     135: aload_3
     136: invokespecial #82                 // Method ryey/easer/plugins/event/d/f$2$2."<init>":(Lryey/easer/plugins/event/d/f$2;Landroid/widget/SimpleCursorAdapter;)V
     139: invokevirtual #86                 // Method android/content/CursorLoader.registerListener:(ILandroid/content/Loader$OnLoadCompleteListener;)V
     142: aload_1
     143: aload_3
     144: new           #17                 // class ryey/easer/plugins/event/d/f$2$3
     147: dup
     148: aload_0
     149: aload_3
     150: invokespecial #87                 // Method ryey/easer/plugins/event/d/f$2$3."<init>":(Lryey/easer/plugins/event/d/f$2;Landroid/widget/SimpleCursorAdapter;)V
     153: invokevirtual #91                 // Method android/app/AlertDialog$Builder.setAdapter:(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
     156: pop
     157: aload_1
     158: invokevirtual #95                 // Method android/app/AlertDialog$Builder.show:()Landroid/app/AlertDialog;
     161: pop
     162: return
}
