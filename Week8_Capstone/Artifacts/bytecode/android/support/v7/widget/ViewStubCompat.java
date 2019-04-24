public final class android.support.v7.widget.ViewStubCompat extends android.view.View {
  public android.support.v7.widget.ViewStubCompat(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #21                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.v7.widget.ViewStubCompat(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #23                 // Method android/view/View."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: iconst_0
       9: putfield      #25                 // Field a:I
      12: aload_1
      13: aload_2
      14: getstatic     #31                 // Field android/support/v7/a/a$j.ViewStubCompat:[I
      17: iload_3
      18: iconst_0
      19: invokevirtual #37                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      22: astore_1
      23: aload_0
      24: aload_1
      25: getstatic     #40                 // Field android/support/v7/a/a$j.ViewStubCompat_android_inflatedId:I
      28: iconst_m1
      29: invokevirtual #46                 // Method android/content/res/TypedArray.getResourceId:(II)I
      32: putfield      #48                 // Field b:I
      35: aload_0
      36: aload_1
      37: getstatic     #51                 // Field android/support/v7/a/a$j.ViewStubCompat_android_layout:I
      40: iconst_0
      41: invokevirtual #46                 // Method android/content/res/TypedArray.getResourceId:(II)I
      44: putfield      #25                 // Field a:I
      47: aload_0
      48: aload_1
      49: getstatic     #54                 // Field android/support/v7/a/a$j.ViewStubCompat_android_id:I
      52: iconst_m1
      53: invokevirtual #46                 // Method android/content/res/TypedArray.getResourceId:(II)I
      56: invokevirtual #58                 // Method setId:(I)V
      59: aload_1
      60: invokevirtual #62                 // Method android/content/res/TypedArray.recycle:()V
      63: aload_0
      64: bipush        8
      66: invokevirtual #65                 // Method setVisibility:(I)V
      69: aload_0
      70: iconst_1
      71: invokevirtual #69                 // Method setWillNotDraw:(Z)V
      74: return

  public android.view.View a();
    Code:
       0: aload_0
       1: invokevirtual #74                 // Method getParent:()Landroid/view/ViewParent;
       4: astore_2
       5: aload_2
       6: ifnull        159
       9: aload_2
      10: instanceof    #76                 // class android/view/ViewGroup
      13: ifeq          159
      16: aload_0
      17: getfield      #25                 // Field a:I
      20: ifeq          149
      23: aload_2
      24: checkcast     #76                 // class android/view/ViewGroup
      27: astore_3
      28: aload_0
      29: getfield      #78                 // Field d:Landroid/view/LayoutInflater;
      32: ifnull        43
      35: aload_0
      36: getfield      #78                 // Field d:Landroid/view/LayoutInflater;
      39: astore_2
      40: goto          51
      43: aload_0
      44: invokevirtual #82                 // Method getContext:()Landroid/content/Context;
      47: invokestatic  #88                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      50: astore_2
      51: aload_2
      52: aload_0
      53: getfield      #25                 // Field a:I
      56: aload_3
      57: iconst_0
      58: invokevirtual #92                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      61: astore_2
      62: aload_0
      63: getfield      #48                 // Field b:I
      66: iconst_m1
      67: if_icmpeq     78
      70: aload_2
      71: aload_0
      72: getfield      #48                 // Field b:I
      75: invokevirtual #93                 // Method android/view/View.setId:(I)V
      78: aload_3
      79: aload_0
      80: invokevirtual #97                 // Method android/view/ViewGroup.indexOfChild:(Landroid/view/View;)I
      83: istore_1
      84: aload_3
      85: aload_0
      86: invokevirtual #101                // Method android/view/ViewGroup.removeViewInLayout:(Landroid/view/View;)V
      89: aload_0
      90: invokevirtual #105                // Method getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      93: astore        4
      95: aload         4
      97: ifnull        111
     100: aload_3
     101: aload_2
     102: iload_1
     103: aload         4
     105: invokevirtual #109                // Method android/view/ViewGroup.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
     108: goto          117
     111: aload_3
     112: aload_2
     113: iload_1
     114: invokevirtual #112                // Method android/view/ViewGroup.addView:(Landroid/view/View;I)V
     117: aload_0
     118: new           #114                // class java/lang/ref/WeakReference
     121: dup
     122: aload_2
     123: invokespecial #117                // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
     126: putfield      #119                // Field c:Ljava/lang/ref/WeakReference;
     129: aload_0
     130: getfield      #121                // Field e:Landroid/support/v7/widget/ViewStubCompat$a;
     133: ifnull        147
     136: aload_0
     137: getfield      #121                // Field e:Landroid/support/v7/widget/ViewStubCompat$a;
     140: aload_0
     141: aload_2
     142: invokeinterface #124,  3          // InterfaceMethod android/support/v7/widget/ViewStubCompat$a.a:(Landroid/support/v7/widget/ViewStubCompat;Landroid/view/View;)V
     147: aload_2
     148: areturn
     149: new           #126                // class java/lang/IllegalArgumentException
     152: dup
     153: ldc           #128                // String ViewStub must have a valid layoutResource
     155: invokespecial #131                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     158: athrow
     159: new           #133                // class java/lang/IllegalStateException
     162: dup
     163: ldc           #135                // String ViewStub must have a non-null ViewGroup viewParent
     165: invokespecial #136                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     168: athrow

  protected void dispatchDraw(android.graphics.Canvas);
    Code:
       0: return

  public void draw(android.graphics.Canvas);
    Code:
       0: return

  public int getInflatedId();
    Code:
       0: aload_0
       1: getfield      #48                 // Field b:I
       4: ireturn

  public android.view.LayoutInflater getLayoutInflater();
    Code:
       0: aload_0
       1: getfield      #78                 // Field d:Landroid/view/LayoutInflater;
       4: areturn

  public int getLayoutResource();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:I
       4: ireturn

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iconst_0
       2: iconst_0
       3: invokevirtual #153                // Method setMeasuredDimension:(II)V
       6: return

  public void setInflatedId(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #48                 // Field b:I
       5: return

  public void setLayoutInflater(android.view.LayoutInflater);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #78                 // Field d:Landroid/view/LayoutInflater;
       5: return

  public void setLayoutResource(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #25                 // Field a:I
       5: return

  public void setOnInflateListener(android.support.v7.widget.ViewStubCompat$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #121                // Field e:Landroid/support/v7/widget/ViewStubCompat$a;
       5: return

  public void setVisibility(int);
    Code:
       0: aload_0
       1: getfield      #119                // Field c:Ljava/lang/ref/WeakReference;
       4: ifnull        38
       7: aload_0
       8: getfield      #119                // Field c:Ljava/lang/ref/WeakReference;
      11: invokevirtual #163                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      14: checkcast     #4                  // class android/view/View
      17: astore_2
      18: aload_2
      19: ifnull        28
      22: aload_2
      23: iload_1
      24: invokevirtual #164                // Method android/view/View.setVisibility:(I)V
      27: return
      28: new           #133                // class java/lang/IllegalStateException
      31: dup
      32: ldc           #166                // String setVisibility called on un-referenced view
      34: invokespecial #136                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      37: athrow
      38: aload_0
      39: iload_1
      40: invokespecial #164                // Method android/view/View.setVisibility:(I)V
      43: iload_1
      44: ifeq          52
      47: iload_1
      48: iconst_4
      49: if_icmpne     57
      52: aload_0
      53: invokevirtual #168                // Method a:()Landroid/view/View;
      56: pop
      57: return
}
