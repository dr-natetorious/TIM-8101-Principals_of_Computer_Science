class ryey.easer.plugins.event.d.f$2$2 implements android.content.Loader$OnLoadCompleteListener<android.database.Cursor> {
  final android.widget.SimpleCursorAdapter a;

  final ryey.easer.plugins.event.d.f$2 b;

  ryey.easer.plugins.event.d.f$2$2(ryey.easer.plugins.event.d.f$2, android.widget.SimpleCursorAdapter);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field b:Lryey/easer/plugins/event/d/f$2;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Landroid/widget/SimpleCursorAdapter;
      10: aload_0
      11: invokespecial #25                 // Method java/lang/Object."<init>":()V
      14: return

  public void a(android.content.Loader<android.database.Cursor>, android.database.Cursor);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/widget/SimpleCursorAdapter;
       4: aload_2
       5: invokevirtual #33                 // Method android/widget/SimpleCursorAdapter.swapCursor:(Landroid/database/Cursor;)Landroid/database/Cursor;
       8: pop
       9: return

  public void onLoadComplete(android.content.Loader, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: checkcast     #39                 // class android/database/Cursor
       6: invokevirtual #41                 // Method a:(Landroid/content/Loader;Landroid/database/Cursor;)V
       9: return
}
