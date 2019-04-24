class android.support.v7.app.AlertController$a$2 extends android.widget.CursorAdapter {
  final android.support.v7.app.AlertController$RecycleListView a;

  final android.support.v7.app.AlertController b;

  final android.support.v7.app.AlertController$a c;

  android.support.v7.app.AlertController$a$2(android.support.v7.app.AlertController$a, android.content.Context, android.database.Cursor, boolean, android.support.v7.app.AlertController$RecycleListView, android.support.v7.app.AlertController);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #23                 // Field c:Landroid/support/v7/app/AlertController$a;
       5: aload_0
       6: aload         5
       8: putfield      #25                 // Field a:Landroid/support/v7/app/AlertController$RecycleListView;
      11: aload_0
      12: aload         6
      14: putfield      #27                 // Field b:Landroid/support/v7/app/AlertController;
      17: aload_0
      18: aload_2
      19: aload_3
      20: iload         4
      22: invokespecial #30                 // Method android/widget/CursorAdapter."<init>":(Landroid/content/Context;Landroid/database/Cursor;Z)V
      25: aload_0
      26: invokevirtual #34                 // Method getCursor:()Landroid/database/Cursor;
      29: astore_1
      30: aload_0
      31: aload_1
      32: aload_0
      33: getfield      #23                 // Field c:Landroid/support/v7/app/AlertController$a;
      36: getfield      #38                 // Field android/support/v7/app/AlertController$a.L:Ljava/lang/String;
      39: invokeinterface #44,  2           // InterfaceMethod android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
      44: putfield      #46                 // Field d:I
      47: aload_0
      48: aload_1
      49: aload_0
      50: getfield      #23                 // Field c:Landroid/support/v7/app/AlertController$a;
      53: getfield      #49                 // Field android/support/v7/app/AlertController$a.M:Ljava/lang/String;
      56: invokeinterface #44,  2           // InterfaceMethod android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
      61: putfield      #51                 // Field e:I
      64: return

  public void bindView(android.view.View, android.content.Context, android.database.Cursor);
    Code:
       0: aload_1
       1: ldc           #55                 // int 16908308
       3: invokevirtual #61                 // Method android/view/View.findViewById:(I)Landroid/view/View;
       6: checkcast     #63                 // class android/widget/CheckedTextView
       9: aload_3
      10: aload_0
      11: getfield      #46                 // Field d:I
      14: invokeinterface #67,  2           // InterfaceMethod android/database/Cursor.getString:(I)Ljava/lang/String;
      19: invokevirtual #71                 // Method android/widget/CheckedTextView.setText:(Ljava/lang/CharSequence;)V
      22: aload_0
      23: getfield      #25                 // Field a:Landroid/support/v7/app/AlertController$RecycleListView;
      26: astore_1
      27: aload_3
      28: invokeinterface #75,  1           // InterfaceMethod android/database/Cursor.getPosition:()I
      33: istore        4
      35: aload_3
      36: aload_0
      37: getfield      #51                 // Field e:I
      40: invokeinterface #79,  2           // InterfaceMethod android/database/Cursor.getInt:(I)I
      45: istore        5
      47: iconst_1
      48: istore        6
      50: iload         5
      52: iconst_1
      53: if_icmpne     59
      56: goto          62
      59: iconst_0
      60: istore        6
      62: aload_1
      63: iload         4
      65: iload         6
      67: invokevirtual #85                 // Method android/support/v7/app/AlertController$RecycleListView.setItemChecked:(IZ)V
      70: return

  public android.view.View newView(android.content.Context, android.database.Cursor, android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #23                 // Field c:Landroid/support/v7/app/AlertController$a;
       4: getfield      #90                 // Field android/support/v7/app/AlertController$a.b:Landroid/view/LayoutInflater;
       7: aload_0
       8: getfield      #27                 // Field b:Landroid/support/v7/app/AlertController;
      11: getfield      #93                 // Field android/support/v7/app/AlertController.m:I
      14: aload_3
      15: iconst_0
      16: invokevirtual #99                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      19: areturn
}
