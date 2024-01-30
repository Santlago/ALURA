import Link from 'next/link'

export default function Page404() {
    return(
        <div>
            <h1>Error - 404</h1>
            <Link href="/">
                Ir para home
            </Link>
        </div>
    )
}