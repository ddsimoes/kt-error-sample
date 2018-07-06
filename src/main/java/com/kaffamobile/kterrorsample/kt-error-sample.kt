/*
 * Copyright (C) Kaffa Mobile - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package com.kaffamobile.kterrorsample


object ComponentBuilder {

    inline operator fun invoke(init: BuilderProps.() -> Unit)  {
        val props = createProps()
        init(props)
    }

    fun createProps(): BuilderProps {
        TODO()
    }

}

interface BuilderProps {
    var builder: () -> Unit
}

interface FooProps  {
    val foo: String
}

class Foo1  {

    val props: FooProps = TODO()

    fun f() {
        ComponentBuilder {
            builder = {
                val returnAction = {}
                BarJava(props.foo, returnAction)
            }
        }
    }
}

class Foo2  {

    val props: FooProps = TODO()

    fun f() {
        ComponentBuilder {
            builder = {
                val returnAction = {}
                BarJava(props.foo, returnAction)
            }
        }
    }

}
