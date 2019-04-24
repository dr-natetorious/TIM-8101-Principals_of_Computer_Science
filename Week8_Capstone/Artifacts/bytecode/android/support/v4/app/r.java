public abstract class android.support.v4.app.r extends android.support.v4.view.q {
  public android.support.v4.app.r(android.support.v4.app.n);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method android/support/v4/view/q."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
       9: aload_0
      10: aconst_null
      11: putfield      #26                 // Field mCurrentPrimaryItem:Landroid/support/v4/app/i;
      14: aload_0
      15: aload_1
      16: putfield      #28                 // Field mFragmentManager:Landroid/support/v4/app/n;
      19: return

  public void destroyItem(android.view.ViewGroup, int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
       4: ifnonnull     18
       7: aload_0
       8: aload_0
       9: getfield      #28                 // Field mFragmentManager:Landroid/support/v4/app/n;
      12: invokevirtual #60                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      15: putfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
      18: aload_0
      19: getfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
      22: aload_3
      23: checkcast     #62                 // class android/support/v4/app/i
      26: invokevirtual #68                 // Method android/support/v4/app/u.b:(Landroid/support/v4/app/i;)Landroid/support/v4/app/u;
      29: pop
      30: return

  public void finishUpdate(android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
       4: ifnull        19
       7: aload_0
       8: getfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
      11: invokevirtual #73                 // Method android/support/v4/app/u.e:()V
      14: aload_0
      15: aconst_null
      16: putfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
      19: return

  public abstract android.support.v4.app.i getItem(int);

  public long getItemId(int);
    Code:
       0: iload_1
       1: i2l
       2: lreturn

  public java.lang.Object instantiateItem(android.view.ViewGroup, int);
    Code:
       0: aload_0
       1: getfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
       4: ifnonnull     18
       7: aload_0
       8: aload_0
       9: getfield      #28                 // Field mFragmentManager:Landroid/support/v4/app/n;
      12: invokevirtual #60                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      15: putfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
      18: aload_0
      19: iload_2
      20: invokevirtual #81                 // Method getItemId:(I)J
      23: lstore_3
      24: aload_1
      25: invokevirtual #87                 // Method android/view/ViewGroup.getId:()I
      28: lload_3
      29: invokestatic  #89                 // Method makeFragmentName:(IJ)Ljava/lang/String;
      32: astore        5
      34: aload_0
      35: getfield      #28                 // Field mFragmentManager:Landroid/support/v4/app/n;
      38: aload         5
      40: invokevirtual #92                 // Method android/support/v4/app/n.a:(Ljava/lang/String;)Landroid/support/v4/app/i;
      43: astore        5
      45: aload         5
      47: ifnull        66
      50: aload_0
      51: getfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
      54: aload         5
      56: invokevirtual #95                 // Method android/support/v4/app/u.c:(Landroid/support/v4/app/i;)Landroid/support/v4/app/u;
      59: pop
      60: aload         5
      62: astore_1
      63: goto          98
      66: aload_0
      67: iload_2
      68: invokevirtual #97                 // Method getItem:(I)Landroid/support/v4/app/i;
      71: astore        5
      73: aload_0
      74: getfield      #24                 // Field mCurTransaction:Landroid/support/v4/app/u;
      77: aload_1
      78: invokevirtual #87                 // Method android/view/ViewGroup.getId:()I
      81: aload         5
      83: aload_1
      84: invokevirtual #87                 // Method android/view/ViewGroup.getId:()I
      87: lload_3
      88: invokestatic  #89                 // Method makeFragmentName:(IJ)Ljava/lang/String;
      91: invokevirtual #100                // Method android/support/v4/app/u.a:(ILandroid/support/v4/app/i;Ljava/lang/String;)Landroid/support/v4/app/u;
      94: pop
      95: aload         5
      97: astore_1
      98: aload_1
      99: aload_0
     100: getfield      #26                 // Field mCurrentPrimaryItem:Landroid/support/v4/app/i;
     103: if_acmpeq     116
     106: aload_1
     107: iconst_0
     108: invokevirtual #104                // Method android/support/v4/app/i.setMenuVisibility:(Z)V
     111: aload_1
     112: iconst_0
     113: invokevirtual #107                // Method android/support/v4/app/i.setUserVisibleHint:(Z)V
     116: aload_1
     117: areturn

  public boolean isViewFromObject(android.view.View, java.lang.Object);
    Code:
       0: aload_2
       1: checkcast     #62                 // class android/support/v4/app/i
       4: invokevirtual #113                // Method android/support/v4/app/i.getView:()Landroid/view/View;
       7: aload_1
       8: if_acmpne     13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public void restoreState(android.os.Parcelable, java.lang.ClassLoader);
    Code:
       0: return

  public android.os.Parcelable saveState();
    Code:
       0: aconst_null
       1: areturn

  public void setPrimaryItem(android.view.ViewGroup, int, java.lang.Object);
    Code:
       0: aload_3
       1: checkcast     #62                 // class android/support/v4/app/i
       4: astore_1
       5: aload_1
       6: aload_0
       7: getfield      #26                 // Field mCurrentPrimaryItem:Landroid/support/v4/app/i;
      10: if_acmpeq     55
      13: aload_0
      14: getfield      #26                 // Field mCurrentPrimaryItem:Landroid/support/v4/app/i;
      17: ifnull        36
      20: aload_0
      21: getfield      #26                 // Field mCurrentPrimaryItem:Landroid/support/v4/app/i;
      24: iconst_0
      25: invokevirtual #104                // Method android/support/v4/app/i.setMenuVisibility:(Z)V
      28: aload_0
      29: getfield      #26                 // Field mCurrentPrimaryItem:Landroid/support/v4/app/i;
      32: iconst_0
      33: invokevirtual #107                // Method android/support/v4/app/i.setUserVisibleHint:(Z)V
      36: aload_1
      37: ifnull        50
      40: aload_1
      41: iconst_1
      42: invokevirtual #104                // Method android/support/v4/app/i.setMenuVisibility:(Z)V
      45: aload_1
      46: iconst_1
      47: invokevirtual #107                // Method android/support/v4/app/i.setUserVisibleHint:(Z)V
      50: aload_0
      51: aload_1
      52: putfield      #26                 // Field mCurrentPrimaryItem:Landroid/support/v4/app/i;
      55: return

  public void startUpdate(android.view.ViewGroup);
    Code:
       0: aload_1
       1: invokevirtual #87                 // Method android/view/ViewGroup.getId:()I
       4: iconst_m1
       5: if_icmpne     48
       8: new           #33                 // class java/lang/StringBuilder
      11: dup
      12: invokespecial #34                 // Method java/lang/StringBuilder."<init>":()V
      15: astore_1
      16: aload_1
      17: ldc           #121                // String ViewPager with adapter
      19: invokevirtual #40                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: pop
      23: aload_1
      24: aload_0
      25: invokevirtual #124                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      28: pop
      29: aload_1
      30: ldc           #126                // String  requires a view id
      32: invokevirtual #40                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      35: pop
      36: new           #128                // class java/lang/IllegalStateException
      39: dup
      40: aload_1
      41: invokevirtual #52                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      44: invokespecial #131                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      47: athrow
      48: return
}
