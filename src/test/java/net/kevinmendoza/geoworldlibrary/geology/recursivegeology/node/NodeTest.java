package net.kevinmendoza.geoworldlibrary.geology.recursivegeology.node;

import net.kevinmendoza.geoworldlibrary.geology.recursivegeology.node.Node.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Set;
import com.flowpowered.math.vector.Vector2i;
import com.flowpowered.math.vector.Vector3i;
import net.kevinmendoza.geoworldlibrary.geology.compositerockdata.IData;
import net.kevinmendoza.geoworldlibrary.geology.recursivegeology.cache.INodeCache;
import net.kevinmendoza.geoworldlibrary.geology.recursivegeology.cache.INodeRegion;
public class NodeTest {

	@Test
	public void type() throws Exception {
		// TODO auto-generated by JUnit Helper.
		assertThat(Node.class, notNullValue());
	}

	@Test
	public void instantiation() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		assertThat(target, notNullValue());
	}

	@Test
	public void getBaseData_A$Vector3i() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		Vector3i vector3i = null;
		IData actual = target.getBaseData(vector3i);
		IData expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getBaseData_A$Vector2i() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		Vector2i vector2i = null;
		IData actual = target.getBaseData(vector2i);
		IData expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getLocationData_A$Vector3i() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		Vector3i vec = null;
		String actual = target.getLocationData(vec);
		String expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getName_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		String actual = target.getName();
		String expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void isLeaf_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		boolean actual = target.isLeaf();
		boolean expected = false;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getCenterDistance_A$Vector3i() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		Vector3i vec = null;
		double actual = target.getCenterDistance(vec);
		double expected = 0.0;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getCenterDistance_A$Vector2i() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		Vector2i vec = null;
		double actual = target.getCenterDistance(vec);
		double expected = 0.0;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getRandomInternalPoint2i_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		Vector2i actual = target.getRandomInternalPoint2i();
		Vector2i expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getRandomInternalPoint3i_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		Vector3i actual = target.getRandomInternalPoint3i();
		Vector3i expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void isInside_A$Vector2i() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		Vector2i vec = null;
		boolean actual = target.isInside(vec);
		boolean expected = false;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void isInside_A$Vector3i() throws Exception {
		// TODO auto-generated by JUnit Helper.
		NodeBuilder nodeBuilder = null;
		Node target = new Node(nodeBuilder);
		Vector3i vec = null;
		boolean actual = target.isInside(vec);
		boolean expected = false;
		assertThat(actual, is(equalTo(expected)));
	}


}
