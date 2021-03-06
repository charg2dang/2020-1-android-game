package kr.ac.kpu.game.charg2dang.cookierun.game.util;

import android.graphics.RectF;

import kr.ac.kpu.game.charg2dang.cookierun.game.iface.BoxCollidable;

public class CollisionHelper
{
	private static RectF r2 = new RectF();
	private static RectF r1 = new RectF();

	public static void collides(BoxCollidable o1, BoxCollidable o2)
	{
		RectF r1 = o1.getColliderBox();
		RectF r2 = o2.getColliderBox();

		if(r1 == null || r2 == null)
		{
			int n = 0;
		}

		if(r1.left > r2.right)
			return;

		if(r1.right < r2.left)
			return;

		if(r1.top > r2.bottom)
			return;

		if(r1.bottom < r2.top)
			return;

		o1.onCollision(o2);
		o2.onCollision(o1);
	}


	public static boolean isOverlapped(RectF r1, RectF r2)
	{
		if(r1 == null || r2 == null)
		{
			int n = 0;
			return false;
		}

		if(r1.left > r2.right)
			return false;

		if(r1.right < r2.left)
			return false;

		if(r1.top > r2.bottom)
			return false;

		if(r1.bottom < r2.top)
			return false;


		return true;
	}


}
