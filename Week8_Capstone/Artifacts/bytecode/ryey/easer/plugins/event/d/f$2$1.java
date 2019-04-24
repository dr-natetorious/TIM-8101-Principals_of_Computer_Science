class ryey.easer.plugins.event.d.f$2$1 extends android.widget.SimpleCursorAdapter {
  final ryey.easer.plugins.event.d.f$2 a;

  ryey.easer.plugins.event.d.f$2$1(ryey.easer.plugins.event.d.f$2, android.content.Context, int, android.database.Cursor, java.lang.String[], int[], int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Lryey/easer/plugins/event/d/f$2;
       5: aload_0
       6: aload_2
       7: iload_3
       8: aload         4
      10: aload         5
      12: aload         6
      14: iload         7
      16: invokespecial #18                 // Method android/widget/SimpleCursorAdapter."<init>":(Landroid/content/Context;ILandroid/database/Cursor;[Ljava/lang/String;[II)V
      19: return

  public void setViewText(android.widget.TextView, java.lang.String);
    Code:
       0: aload_2
       1: astore_3
       2: aload_1
       3: invokevirtual #27                 // Method android/widget/TextView.getId:()I
       6: ldc           #28                 // int 16908309
       8: if_icmpne     44
      11: new           #30                 // class java/lang/StringBuilder
      14: dup
      15: invokespecial #33                 // Method java/lang/StringBuilder."<init>":()V
      18: astore_3
      19: aload_3
      20: ldc           #35                 // String (
      22: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      25: pop
      26: aload_3
      27: aload_2
      28: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      31: pop
      32: aload_3
      33: ldc           #41                 // String )
      35: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: aload_3
      40: invokevirtual #45                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      43: astore_3
      44: aload_0
      45: aload_1
      46: aload_3
      47: invokespecial #47                 // Method android/widget/SimpleCursorAdapter.setViewText:(Landroid/widget/TextView;Ljava/lang/String;)V
      50: return
}
