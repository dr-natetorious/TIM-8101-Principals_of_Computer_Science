class ryey.easer.plugins.event.d.e {
  static java.lang.String a(android.content.ContentResolver, long);
    Code:
       0: getstatic     #15                 // Field android/provider/CalendarContract$Calendars.CONTENT_URI:Landroid/net/Uri;
       3: astore        4
       5: aconst_null
       6: astore_3
       7: aload_0
       8: aload         4
      10: iconst_2
      11: anewarray     #17                 // class java/lang/String
      14: dup
      15: iconst_0
      16: ldc           #19                 // String _id
      18: aastore
      19: dup
      20: iconst_1
      21: ldc           #21                 // String calendar_displayName
      23: aastore
      24: ldc           #23                 // String ((_id = ?))
      26: iconst_1
      27: anewarray     #17                 // class java/lang/String
      30: dup
      31: iconst_0
      32: lload_1
      33: invokestatic  #27                 // Method java/lang/String.valueOf:(J)Ljava/lang/String;
      36: aastore
      37: aconst_null
      38: invokevirtual #33                 // Method android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      41: astore        4
      43: aload         4
      45: ifnonnull     50
      48: aconst_null
      49: areturn
      50: aload_3
      51: astore_0
      52: aload         4
      54: invokeinterface #39,  1           // InterfaceMethod android/database/Cursor.moveToNext:()Z
      59: ifeq          71
      62: aload         4
      64: iconst_1
      65: invokeinterface #43,  2           // InterfaceMethod android/database/Cursor.getString:(I)Ljava/lang/String;
      70: astore_0
      71: aload         4
      73: invokeinterface #47,  1           // InterfaceMethod android/database/Cursor.close:()V
      78: aload_0
      79: areturn

  static java.lang.Long b(android.content.ContentResolver, long);
    Code:
       0: invokestatic  #56                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
       3: invokevirtual #60                 // Method java/util/Calendar.getTimeInMillis:()J
       6: lstore_3
       7: aload_0
       8: getstatic     #63                 // Field android/provider/CalendarContract$Events.CONTENT_URI:Landroid/net/Uri;
      11: iconst_3
      12: anewarray     #17                 // class java/lang/String
      15: dup
      16: iconst_0
      17: ldc           #19                 // String _id
      19: aastore
      20: dup
      21: iconst_1
      22: ldc           #65                 // String dtstart
      24: aastore
      25: dup
      26: iconst_2
      27: ldc           #67                 // String dtend
      29: aastore
      30: ldc           #69                 // String ((calendar_id = ?) AND (dtstart > ?))
      32: iconst_2
      33: anewarray     #17                 // class java/lang/String
      36: dup
      37: iconst_0
      38: lload_1
      39: invokestatic  #27                 // Method java/lang/String.valueOf:(J)Ljava/lang/String;
      42: aastore
      43: dup
      44: iconst_1
      45: lload_3
      46: invokestatic  #27                 // Method java/lang/String.valueOf:(J)Ljava/lang/String;
      49: aastore
      50: ldc           #71                 // String dtstart ASC
      52: invokevirtual #33                 // Method android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      55: astore        5
      57: aconst_null
      58: astore_0
      59: aload         5
      61: ifnonnull     66
      64: aconst_null
      65: areturn
      66: aload         5
      68: invokeinterface #39,  1           // InterfaceMethod android/database/Cursor.moveToNext:()Z
      73: ifeq          88
      76: aload         5
      78: iconst_1
      79: invokeinterface #75,  2           // InterfaceMethod android/database/Cursor.getLong:(I)J
      84: invokestatic  #80                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      87: astore_0
      88: aload         5
      90: invokeinterface #47,  1           // InterfaceMethod android/database/Cursor.close:()V
      95: aload_0
      96: areturn

  static java.lang.Long c(android.content.ContentResolver, long);
    Code:
       0: invokestatic  #56                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
       3: invokevirtual #60                 // Method java/util/Calendar.getTimeInMillis:()J
       6: lstore_3
       7: aload_0
       8: getstatic     #63                 // Field android/provider/CalendarContract$Events.CONTENT_URI:Landroid/net/Uri;
      11: iconst_3
      12: anewarray     #17                 // class java/lang/String
      15: dup
      16: iconst_0
      17: ldc           #19                 // String _id
      19: aastore
      20: dup
      21: iconst_1
      22: ldc           #65                 // String dtstart
      24: aastore
      25: dup
      26: iconst_2
      27: ldc           #67                 // String dtend
      29: aastore
      30: ldc           #83                 // String ((calendar_id = ?) AND (dtend > ?))
      32: iconst_2
      33: anewarray     #17                 // class java/lang/String
      36: dup
      37: iconst_0
      38: lload_1
      39: invokestatic  #27                 // Method java/lang/String.valueOf:(J)Ljava/lang/String;
      42: aastore
      43: dup
      44: iconst_1
      45: lload_3
      46: invokestatic  #27                 // Method java/lang/String.valueOf:(J)Ljava/lang/String;
      49: aastore
      50: ldc           #85                 // String dtend ASC
      52: invokevirtual #33                 // Method android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      55: astore        5
      57: aconst_null
      58: astore_0
      59: aload         5
      61: ifnonnull     66
      64: aconst_null
      65: areturn
      66: aload         5
      68: invokeinterface #39,  1           // InterfaceMethod android/database/Cursor.moveToNext:()Z
      73: ifeq          88
      76: aload         5
      78: iconst_2
      79: invokeinterface #75,  2           // InterfaceMethod android/database/Cursor.getLong:(I)J
      84: invokestatic  #80                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      87: astore_0
      88: aload         5
      90: invokeinterface #47,  1           // InterfaceMethod android/database/Cursor.close:()V
      95: aload_0
      96: areturn
}
