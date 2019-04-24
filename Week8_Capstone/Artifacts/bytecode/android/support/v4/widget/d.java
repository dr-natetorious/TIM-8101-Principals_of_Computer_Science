public abstract class android.support.v4.widget.d extends android.widget.BaseAdapter implements android.support.v4.widget.e$a,android.widget.Filterable {
  protected boolean a;

  protected boolean b;

  protected android.database.Cursor c;

  protected android.content.Context d;

  protected int e;

  protected android.support.v4.widget.d$a f;

  protected android.database.DataSetObserver g;

  protected android.support.v4.widget.e h;

  protected android.widget.FilterQueryProvider i;

  public android.support.v4.widget.d(android.content.Context, android.database.Cursor, boolean);
    Code:
       0: aload_0
       1: invokespecial #34                 // Method android/widget/BaseAdapter."<init>":()V
       4: iload_3
       5: ifeq          14
       8: iconst_1
       9: istore        4
      11: goto          17
      14: iconst_2
      15: istore        4
      17: aload_0
      18: aload_1
      19: aload_2
      20: iload         4
      22: invokevirtual #37                 // Method a:(Landroid/content/Context;Landroid/database/Cursor;I)V
      25: return

  public android.database.Cursor a();
    Code:
       0: aload_0
       1: getfield      #41                 // Field c:Landroid/database/Cursor;
       4: areturn

  public android.database.Cursor a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #44                 // Field i:Landroid/widget/FilterQueryProvider;
       4: ifnull        18
       7: aload_0
       8: getfield      #44                 // Field i:Landroid/widget/FilterQueryProvider;
      11: aload_1
      12: invokeinterface #49,  2           // InterfaceMethod android/widget/FilterQueryProvider.runQuery:(Ljava/lang/CharSequence;)Landroid/database/Cursor;
      17: areturn
      18: aload_0
      19: getfield      #41                 // Field c:Landroid/database/Cursor;
      22: areturn

  public abstract android.view.View a(android.content.Context, android.database.Cursor, android.view.ViewGroup);

  void a(android.content.Context, android.database.Cursor, int);
    Code:
       0: iconst_0
       1: istore        5
       3: iload_3
       4: iconst_1
       5: iand
       6: iconst_1
       7: if_icmpne     22
      10: iload_3
      11: iconst_2
      12: ior
      13: istore_3
      14: aload_0
      15: iconst_1
      16: putfield      #52                 // Field b:Z
      19: goto          27
      22: aload_0
      23: iconst_0
      24: putfield      #52                 // Field b:Z
      27: aload_2
      28: ifnull        34
      31: iconst_1
      32: istore        5
      34: aload_0
      35: aload_2
      36: putfield      #41                 // Field c:Landroid/database/Cursor;
      39: aload_0
      40: iload         5
      42: putfield      #54                 // Field a:Z
      45: aload_0
      46: aload_1
      47: putfield      #56                 // Field d:Landroid/content/Context;
      50: iload         5
      52: ifeq          68
      55: aload_2
      56: ldc           #58                 // String _id
      58: invokeinterface #64,  2           // InterfaceMethod android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
      63: istore        4
      65: goto          71
      68: iconst_m1
      69: istore        4
      71: aload_0
      72: iload         4
      74: putfield      #66                 // Field e:I
      77: iload_3
      78: iconst_2
      79: iand
      80: iconst_2
      81: if_icmpne     113
      84: aload_0
      85: new           #10                 // class android/support/v4/widget/d$a
      88: dup
      89: aload_0
      90: invokespecial #69                 // Method android/support/v4/widget/d$a."<init>":(Landroid/support/v4/widget/d;)V
      93: putfield      #71                 // Field f:Landroid/support/v4/widget/d$a;
      96: new           #13                 // class android/support/v4/widget/d$b
      99: dup
     100: aload_0
     101: invokespecial #72                 // Method android/support/v4/widget/d$b."<init>":(Landroid/support/v4/widget/d;)V
     104: astore_1
     105: aload_0
     106: aload_1
     107: putfield      #74                 // Field g:Landroid/database/DataSetObserver;
     110: goto          123
     113: aconst_null
     114: astore_1
     115: aload_0
     116: aconst_null
     117: putfield      #71                 // Field f:Landroid/support/v4/widget/d$a;
     120: goto          105
     123: iload         5
     125: ifeq          162
     128: aload_0
     129: getfield      #71                 // Field f:Landroid/support/v4/widget/d$a;
     132: ifnull        145
     135: aload_2
     136: aload_0
     137: getfield      #71                 // Field f:Landroid/support/v4/widget/d$a;
     140: invokeinterface #78,  2           // InterfaceMethod android/database/Cursor.registerContentObserver:(Landroid/database/ContentObserver;)V
     145: aload_0
     146: getfield      #74                 // Field g:Landroid/database/DataSetObserver;
     149: ifnull        162
     152: aload_2
     153: aload_0
     154: getfield      #74                 // Field g:Landroid/database/DataSetObserver;
     157: invokeinterface #82,  2           // InterfaceMethod android/database/Cursor.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
     162: return

  public void a(android.database.Cursor);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #86                 // Method b:(Landroid/database/Cursor;)Landroid/database/Cursor;
       5: astore_1
       6: aload_1
       7: ifnull        16
      10: aload_1
      11: invokeinterface #89,  1           // InterfaceMethod android/database/Cursor.close:()V
      16: return

  public abstract void a(android.view.View, android.content.Context, android.database.Cursor);

  public android.database.Cursor b(android.database.Cursor);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #41                 // Field c:Landroid/database/Cursor;
       5: if_acmpne     10
       8: aconst_null
       9: areturn
      10: aload_0
      11: getfield      #41                 // Field c:Landroid/database/Cursor;
      14: astore_2
      15: aload_2
      16: ifnull        53
      19: aload_0
      20: getfield      #71                 // Field f:Landroid/support/v4/widget/d$a;
      23: ifnull        36
      26: aload_2
      27: aload_0
      28: getfield      #71                 // Field f:Landroid/support/v4/widget/d$a;
      31: invokeinterface #93,  2           // InterfaceMethod android/database/Cursor.unregisterContentObserver:(Landroid/database/ContentObserver;)V
      36: aload_0
      37: getfield      #74                 // Field g:Landroid/database/DataSetObserver;
      40: ifnull        53
      43: aload_2
      44: aload_0
      45: getfield      #74                 // Field g:Landroid/database/DataSetObserver;
      48: invokeinterface #96,  2           // InterfaceMethod android/database/Cursor.unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V
      53: aload_0
      54: aload_1
      55: putfield      #41                 // Field c:Landroid/database/Cursor;
      58: aload_1
      59: ifnull        119
      62: aload_0
      63: getfield      #71                 // Field f:Landroid/support/v4/widget/d$a;
      66: ifnull        79
      69: aload_1
      70: aload_0
      71: getfield      #71                 // Field f:Landroid/support/v4/widget/d$a;
      74: invokeinterface #78,  2           // InterfaceMethod android/database/Cursor.registerContentObserver:(Landroid/database/ContentObserver;)V
      79: aload_0
      80: getfield      #74                 // Field g:Landroid/database/DataSetObserver;
      83: ifnull        96
      86: aload_1
      87: aload_0
      88: getfield      #74                 // Field g:Landroid/database/DataSetObserver;
      91: invokeinterface #82,  2           // InterfaceMethod android/database/Cursor.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
      96: aload_0
      97: aload_1
      98: ldc           #58                 // String _id
     100: invokeinterface #64,  2           // InterfaceMethod android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
     105: putfield      #66                 // Field e:I
     108: aload_0
     109: iconst_1
     110: putfield      #54                 // Field a:Z
     113: aload_0
     114: invokevirtual #99                 // Method notifyDataSetChanged:()V
     117: aload_2
     118: areturn
     119: aload_0
     120: iconst_m1
     121: putfield      #66                 // Field e:I
     124: aload_0
     125: iconst_0
     126: putfield      #54                 // Field a:Z
     129: aload_0
     130: invokevirtual #102                // Method notifyDataSetInvalidated:()V
     133: aload_2
     134: areturn

  public android.view.View b(android.content.Context, android.database.Cursor, android.view.ViewGroup);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: invokevirtual #104                // Method a:(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
       7: areturn

  protected void b();
    Code:
       0: aload_0
       1: getfield      #52                 // Field b:Z
       4: ifeq          39
       7: aload_0
       8: getfield      #41                 // Field c:Landroid/database/Cursor;
      11: ifnull        39
      14: aload_0
      15: getfield      #41                 // Field c:Landroid/database/Cursor;
      18: invokeinterface #108,  1          // InterfaceMethod android/database/Cursor.isClosed:()Z
      23: ifne          39
      26: aload_0
      27: aload_0
      28: getfield      #41                 // Field c:Landroid/database/Cursor;
      31: invokeinterface #111,  1          // InterfaceMethod android/database/Cursor.requery:()Z
      36: putfield      #54                 // Field a:Z
      39: return

  public java.lang.CharSequence c(android.database.Cursor);
    Code:
       0: aload_1
       1: ifnonnull     7
       4: ldc           #114                // String
       6: areturn
       7: aload_1
       8: invokevirtual #120                // Method java/lang/Object.toString:()Ljava/lang/String;
      11: areturn

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Z
       4: ifeq          24
       7: aload_0
       8: getfield      #41                 // Field c:Landroid/database/Cursor;
      11: ifnull        24
      14: aload_0
      15: getfield      #41                 // Field c:Landroid/database/Cursor;
      18: invokeinterface #124,  1          // InterfaceMethod android/database/Cursor.getCount:()I
      23: ireturn
      24: iconst_0
      25: ireturn

  public android.view.View getDropDownView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Z
       4: ifeq          57
       7: aload_0
       8: getfield      #41                 // Field c:Landroid/database/Cursor;
      11: iload_1
      12: invokeinterface #130,  2          // InterfaceMethod android/database/Cursor.moveToPosition:(I)Z
      17: pop
      18: aload_2
      19: astore        4
      21: aload_2
      22: ifnonnull     40
      25: aload_0
      26: aload_0
      27: getfield      #56                 // Field d:Landroid/content/Context;
      30: aload_0
      31: getfield      #41                 // Field c:Landroid/database/Cursor;
      34: aload_3
      35: invokevirtual #132                // Method b:(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
      38: astore        4
      40: aload_0
      41: aload         4
      43: aload_0
      44: getfield      #56                 // Field d:Landroid/content/Context;
      47: aload_0
      48: getfield      #41                 // Field c:Landroid/database/Cursor;
      51: invokevirtual #134                // Method a:(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
      54: aload         4
      56: areturn
      57: aconst_null
      58: areturn

  public android.widget.Filter getFilter();
    Code:
       0: aload_0
       1: getfield      #138                // Field h:Landroid/support/v4/widget/e;
       4: ifnonnull     19
       7: aload_0
       8: new           #140                // class android/support/v4/widget/e
      11: dup
      12: aload_0
      13: invokespecial #143                // Method android/support/v4/widget/e."<init>":(Landroid/support/v4/widget/e$a;)V
      16: putfield      #138                // Field h:Landroid/support/v4/widget/e;
      19: aload_0
      20: getfield      #138                // Field h:Landroid/support/v4/widget/e;
      23: areturn

  public java.lang.Object getItem(int);
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Z
       4: ifeq          30
       7: aload_0
       8: getfield      #41                 // Field c:Landroid/database/Cursor;
      11: ifnull        30
      14: aload_0
      15: getfield      #41                 // Field c:Landroid/database/Cursor;
      18: iload_1
      19: invokeinterface #130,  2          // InterfaceMethod android/database/Cursor.moveToPosition:(I)Z
      24: pop
      25: aload_0
      26: getfield      #41                 // Field c:Landroid/database/Cursor;
      29: areturn
      30: aconst_null
      31: areturn

  public long getItemId(int);
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Z
       4: ifeq          41
       7: aload_0
       8: getfield      #41                 // Field c:Landroid/database/Cursor;
      11: ifnull        41
      14: aload_0
      15: getfield      #41                 // Field c:Landroid/database/Cursor;
      18: iload_1
      19: invokeinterface #130,  2          // InterfaceMethod android/database/Cursor.moveToPosition:(I)Z
      24: ifeq          41
      27: aload_0
      28: getfield      #41                 // Field c:Landroid/database/Cursor;
      31: aload_0
      32: getfield      #66                 // Field e:I
      35: invokeinterface #150,  2          // InterfaceMethod android/database/Cursor.getLong:(I)J
      40: lreturn
      41: lconst_0
      42: lreturn

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Z
       4: ifne          17
       7: new           #153                // class java/lang/IllegalStateException
      10: dup
      11: ldc           #155                // String this should only be called when the cursor is valid
      13: invokespecial #158                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: aload_0
      18: getfield      #41                 // Field c:Landroid/database/Cursor;
      21: iload_1
      22: invokeinterface #130,  2          // InterfaceMethod android/database/Cursor.moveToPosition:(I)Z
      27: ifne          63
      30: new           #160                // class java/lang/StringBuilder
      33: dup
      34: invokespecial #161                // Method java/lang/StringBuilder."<init>":()V
      37: astore_2
      38: aload_2
      39: ldc           #163                // String couldn't move cursor to position
      41: invokevirtual #167                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      44: pop
      45: aload_2
      46: iload_1
      47: invokevirtual #170                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      50: pop
      51: new           #153                // class java/lang/IllegalStateException
      54: dup
      55: aload_2
      56: invokevirtual #171                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      59: invokespecial #158                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      62: athrow
      63: aload_2
      64: astore        4
      66: aload_2
      67: ifnonnull     85
      70: aload_0
      71: aload_0
      72: getfield      #56                 // Field d:Landroid/content/Context;
      75: aload_0
      76: getfield      #41                 // Field c:Landroid/database/Cursor;
      79: aload_3
      80: invokevirtual #104                // Method a:(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
      83: astore        4
      85: aload_0
      86: aload         4
      88: aload_0
      89: getfield      #56                 // Field d:Landroid/content/Context;
      92: aload_0
      93: getfield      #41                 // Field c:Landroid/database/Cursor;
      96: invokevirtual #134                // Method a:(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
      99: aload         4
     101: areturn

  public boolean hasStableIds();
    Code:
       0: iconst_1
       1: ireturn
}
