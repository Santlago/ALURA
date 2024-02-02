import PageTitle from 'next/head'

export default function Title({ children, props }) {
    return(
        <PageTitle>
            <title>{children}</title>
        </PageTitle>
    )
}