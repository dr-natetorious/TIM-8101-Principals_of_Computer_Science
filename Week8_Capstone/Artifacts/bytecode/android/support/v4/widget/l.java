public abstract class android.support.v4.widget.l extends android.support.v4.widget.d {
  public android.support.v4.widget.l(android.content.Context, int, android.database.Cursor, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_3
       3: iload         4
       5: invokespecial #15                 // Method android/support/v4/widget/d."<init>":(Landroid/content/Context;Landroid/database/Cursor;Z)V
       8: aload_0
       9: iload_2
      10: putfield      #17                 // Field k:I
      13: aload_0
      14: iload_2
      15: putfield      #19                 // Field j:I
      18: aload_0
      19: aload_1
      20: ldc           #21                 // String layout_inflater
      22: invokevirtual #27                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      25: checkcast     #29                 // class android/view/LayoutInflater
      28: putfield      #31                 // Field l:Landroid/view/LayoutInflater;
      31: return

  public android.view.View a(android.content.Context, android.database.Cursor, android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #31                 // Field l:Landroid/view/LayoutInflater;
       4: aload_0
       5: getfield      #19                 // Field j:I
       8: aload_3
       9: iconst_0
      10: invokevirtual #39                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      13: areturn

  public android.view.View b(android.content.Context, android.database.Cursor, android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #31                 // Field l:Landroid/view/LayoutInflater;
       4: aload_0
       5: getfield      #17                 // Field k:I
       8: aload_3
       9: iconst_0
      10: invokevirtual #39                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      13: areturn
}
